// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

function SortDescending(arr) {
    let n = arr.length;
    let swapped;

    do {
        swapped = false;
        for (let i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                let temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
    } while (swapped);
}

const input = prompt("enter elements and press enter to sort:");
const unsortedArray = input.split(' ').map(Number);

SortDescending(unsortedArray);

console.log("Sorted Array in Descending Order: " + unsortedArray);
