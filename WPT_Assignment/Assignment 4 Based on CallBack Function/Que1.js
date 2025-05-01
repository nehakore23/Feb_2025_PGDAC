// Step 1: Define the callback function
function toUpperCase(str) {
    return str.toUpperCase();
}

// Step 2: Define the processData function that uses a callback
function processData(inputString, callback) {
    const result = callback(inputString);
    console.log(result);
}

// Step 3: Call processData with a string and the callback function
processData("hello world", toUpperCase);
