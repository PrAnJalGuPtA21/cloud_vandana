function SortDescending(arr) {
    let n = arr.length;

    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

// For testing the above the code.......
let array = [10, 2, 15, 23, 5];
let sorted_numbers = SortDescending(array);
console.log(sorted_numbers);
