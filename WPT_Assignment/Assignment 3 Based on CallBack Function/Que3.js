// Step 1: Define the fetchData function
function fetchData(url, callback) {
    console.log(`Fetching data from ${url}...`);

    // Step 2: Simulate a network delay using setTimeout
    setTimeout(function () {
        const response = `Response from ${url}`;

        // Step 3: Call the callback with the response
        callback(response);
    }, 2000); // 2-second delay
}

// Step 4: Call fetchData with a URL and a callback
fetchData("https://api.example.com/data", function (response) {
    console.log("Received:", response);
});
