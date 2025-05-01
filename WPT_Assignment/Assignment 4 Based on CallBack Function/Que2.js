// Step 1: Define the forEachElement function
function forEachElement(array, callback) {
    for (let i = 0; i < array.length; i++) {
        callback(array[i], i);
    }
}

// Step 2: Call forEachElement with an array and an anonymous callback
forEachElement([1, 2, 3, 4], function (element, index) {
    console.log(`Index ${index}: ${element * 2}`);
});
