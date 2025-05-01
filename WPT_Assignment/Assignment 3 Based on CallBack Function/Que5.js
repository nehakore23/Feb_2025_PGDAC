// fetchData from Exercise 4 with error handling
function fetchData(url, callback) {
    console.log(`Fetching data from ${url}...`);

    setTimeout(function () {
        const success = Math.random() > 0.3; // 70% chance of success

        if (success) {
            const response = `Response from ${url}`;
            callback(null, response);
        } else {
            callback("Network error occurred", null);
        }
    }, 2000);
}

// processData simulates modifying the fetched data
function processData(data, callback) {
    setTimeout(function () {
        const processed = `${data} [Processed]`;
        callback(processed);
    }, 1000);
}

// Chain fetchData and processData using nested callbacks
fetchData("https://api.example.com/data", function (error, response) {
    if (error) {
        console.error("Error:", error);
    } else {
        console.log("Received:", response);
        processData(response, function (processedResult) {
            console.log("Processed:", processedResult);
        });
    }
});
