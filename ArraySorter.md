# `ArraySorter` Class Documentation

## Overview

The `ArraySorter` class is a utility class designed to sort arrays of integers using the **Bubble Sort** algorithm. It serves as an example of how sorting works by iteratively comparing and swapping adjacent elements in the array until it is fully sorted.

This class includes functionality for both sorting the array and visually displaying the process before and after sorting.

---

## Features

- **Bubble Sort Algorithm**: Implements a simple sorting technique where adjacent elements are swapped if they are in the wrong order. The process is repeated until the array is sorted.
- **Array Display**: Displays the array both in its original form and after being sorted.

---

## Methods

### `main(String[] args)`

The main entry point for the program. It:
1. Defines a sample integer array.
2. Displays the original array.
3. Invokes the `bubbleSort` method to sort the array.
4. Displays the sorted array.

**Example Output**:
```
Original array:
5 2 9 1 5 6
Sorted array:
1 2 5 5 6 9
```

---

### `bubbleSort(int[] array)`

Sorts the provided integer array using the **Bubble Sort** algorithm. It repeatedly traverses the array and swaps adjacent elements if they are out of order. The process continues until the array is fully sorted.

#### Parameters:
- `array`: The integer array to be sorted.

#### Key Steps:
1. Uses a `do-while` loop to ensure at least one full pass over the array.
2. Continuously reduces the range of the array to be checked as larger elements "bubble up" to the correct positions.
3. Swaps elements when needed using the helper method `swap`.

---

### `swap(int[] array, int index1, int index2)`

A helper method that swaps two elements in the array.

#### Parameters:
- `array`: The integer array in which elements need to be swapped.
- `index1`: The index of the first element to swap.
- `index2`: The index of the second element to swap.

#### Key Steps:
1. Uses a temporary variable to hold one of the values during the swap.
2. Updates values of the two positions to complete the swap.

---

## Examples

### Example Input:
```java
int[] numbers = {5, 2, 9, 1, 5, 6};
```

### Example Console Output:
```
Original array:
5 2 9 1 5 6
Sorted array:
1 2 5 5 6 9
```

---

## Bubble Sort Overview

The **Bubble Sort** algorithm works by comparing adjacent elements in the array and swapping them if they are in the wrong order. This process is repeated until no elements need to be swapped, ensuring the array is sorted.

Key Characteristics:
- Simple to understand and implement.
- Performance:
    - **Worst-case time complexity**: O(n²)
    - **Best-case time complexity**: O(n) (when the array is already sorted)

---

## Use Cases

- Educational purposes to learn how sorting algorithms work.
- Demonstrates the importance of algorithmic efficiency in small-scale operations.

---

## Limitations

1. **Inefficiency on Larger Arrays**: The Bubble Sort algorithm is not optimal for large datasets due to its O(n²) time complexity.
2. **Sorting Only Integers**: The current implementation is limited to sorting arrays of integers. To make it more generic, you could modify it to sort other data types or use a comparator.

---

## Suggestions for Improvement

- **Support Sorting Other Data Types**: Implement a generic version of the sort method that can handle other data types like `float`, `double`, or objects.
- **Implement Alternative Sorting Algorithms**: Introduce more efficient algorithms like Quick Sort or Merge Sort for better performance.
- **Dynamic Input**: Allow the program to accept user input for arrays instead of using hardcoded values.

---

## Conclusion

The `ArraySorter` class demonstrates an effective way to learn and understand the fundamentals of sorting with the Bubble Sort algorithm. While it is educational and simple, optimizing the algorithm for practical use cases is recommended for larger datasets.