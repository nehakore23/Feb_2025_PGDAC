// Modified fetchData with error handling
function fetchData(url, callback) {
    console.log(`Fetching data from ${url}...`);

    setTimeout(function () {
        // Simulate random success or error
        const success = Math.random() > 0.3; // 70% chance of success

        if (success) {
            const response = `Response from ${url}`;
            callback(null, response); // No error, pass the response
        } else {
            const error = "Network error occurred";
            callback(error, null); // Pass the error
        }
    }, 2000);
}

// Call fetchData and handle both success and error
fetchData("https://api.example.com/data", function (error, response) {
    if (error) {
        console.error("Error:", error);
    } else {
        console.log("Received:", response);
    }
});
