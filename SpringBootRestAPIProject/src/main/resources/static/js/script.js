// API endpoints
const API_URL = {
    GET_ALL: '/student/students',
    GET_ONE: (id) => `/student/students/${id}`,
    CREATE: '/student/add',
    UPDATE: (id) => `/student/update/${id}`,
    DELETE: (id) => `/student/delete/${id}`
};

// DOM Elements
const studentForm = document.getElementById('studentForm');
const studentTableBody = document.getElementById('studentTableBody');
const editModal = new bootstrap.Modal(document.getElementById('editModal'));
const editForm = document.getElementById('editForm');
const saveEditBtn = document.getElementById('saveEdit');

// Load all students when page loads
document.addEventListener('DOMContentLoaded', loadStudents);

// Add new student
studentForm.addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const student = {
        name: document.getElementById('name').value,
        percentage: parseFloat(document.getElementById('percentage').value),
        branch: document.getElementById('branch').value
    };

    try {
        const response = await fetch(API_URL.CREATE, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(student)
        });

        const data = await response.json();

        if (response.ok) {
            studentForm.reset();
            loadStudents();
            showAlert('Student added successfully!', 'success');
        } else {
            showAlert(`Error adding student: ${data.message || 'Unknown error'}`, 'danger');
        }
    } catch (error) {
        console.error('Error:', error);
        showAlert(`Error adding student: ${error.message}`, 'danger');
    }
});

// Load all students
async function loadStudents() {
    try {
        const response = await fetch(API_URL.GET_ALL);
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }
        const data = await response.json();
        
        if (!Array.isArray(data)) {
            console.error('Expected array but got:', data);
            showAlert('Error: Invalid data format received from server', 'danger');
            return;
        }
        
        studentTableBody.innerHTML = '';
        data.forEach(student => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${student.rollNo}</td>
                <td>${student.name}</td>
                <td>${student.percentage}</td>
                <td>${student.branch}</td>
                <td>
                    <button class="btn btn-sm btn-primary btn-action" onclick="editStudent(${student.rollNo})">Edit</button>
                    <button class="btn btn-sm btn-danger btn-action" onclick="deleteStudent(${student.rollNo})">Delete</button>
                </td>
            `;
            studentTableBody.appendChild(row);
        });
    } catch (error) {
        console.error('Error loading students:', error);
        showAlert(`Error loading students: ${error.message}`, 'danger');
    }
}

// Edit student
async function editStudent(id) {
    try {
        const response = await fetch(API_URL.GET_ONE(id));
        const student = await response.json();
        
        document.getElementById('editRollNo').value = student.rollNo;
        document.getElementById('editName').value = student.name;
        document.getElementById('editPercentage').value = student.percentage;
        document.getElementById('editBranch').value = student.branch;
        
        editModal.show();
    } catch (error) {
        showAlert('Error loading student details!', 'danger');
        console.error('Error:', error);
    }
}

// Save edited student
saveEditBtn.addEventListener('click', async () => {
    const id = document.getElementById('editRollNo').value;
    const student = {
        name: document.getElementById('editName').value,
        percentage: parseFloat(document.getElementById('editPercentage').value),
        branch: document.getElementById('editBranch').value
    };

    try {
        const response = await fetch(API_URL.UPDATE(id), {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(student)
        });

        if (response.ok) {
            editModal.hide();
            loadStudents();
            showAlert('Student updated successfully!', 'success');
        } else {
            showAlert('Error updating student!', 'danger');
        }
    } catch (error) {
        showAlert('Error updating student!', 'danger');
        console.error('Error:', error);
    }
});

// Delete student
async function deleteStudent(id) {
    if (confirm('Are you sure you want to delete this student?')) {
        try {
            const response = await fetch(API_URL.DELETE(id), {
                method: 'DELETE'
            });

            if (response.ok) {
                loadStudents();
                showAlert('Student deleted successfully!', 'success');
            } else {
                showAlert('Error deleting student!', 'danger');
            }
        } catch (error) {
            showAlert('Error deleting student!', 'danger');
            console.error('Error:', error);
        }
    }
}

// Show alert message
function showAlert(message, type) {
    const alertDiv = document.createElement('div');
    alertDiv.className = `alert alert-${type} alert-dismissible fade show`;
    alertDiv.innerHTML = `
        ${message}
        <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
    `;
    
    document.querySelector('.container').insertAdjacentElement('afterbegin', alertDiv);
    
    setTimeout(() => {
        alertDiv.remove();
    }, 3000);
} 