package unbreakk1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArraySorterTest {

    @Test
    void testBubbleSort_withUnsortedArray() {
        // Test case: unsorted array
        int[] input = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};

        ArraySorter.bubbleSort(input);

        assertArrayEquals(expected, input, "The array should be sorted in ascending order.");
    }

    @Test
    void testBubbleSort_withAlreadySortedArray() {
        // Test case: array already sorted
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};

        ArraySorter.bubbleSort(input);

        assertArrayEquals(expected, input, "The already sorted array should remain unchanged.");
    }

    @Test
    void testBubbleSort_withReverseArray() {
        // Test case: array sorted in descending order
        int[] input = {6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};

        ArraySorter.bubbleSort(input);

        assertArrayEquals(expected, input, "The array should be sorted in ascending order.");
    }

    @Test
    void testBubbleSort_withDuplicates() {
        // Test case: array with duplicate elements
        int[] input = {4, 2, 4, 1, 2, 4};
        int[] expected = {1, 2, 2, 4, 4, 4};

        ArraySorter.bubbleSort(input);

        assertArrayEquals(expected, input, "The array with duplicates should be sorted correctly.");
    }

    @Test
    void testBubbleSort_withSingleElement() {
        // Test case: array with a single element
        int[] input = {7};
        int[] expected = {7};

        ArraySorter.bubbleSort(input);

        assertArrayEquals(expected, input, "A single-element array should remain unchanged.");
    }

    @Test
    void testBubbleSort_withEmptyArray() {
        // Test case: empty array
        int[] input = {};
        int[] expected = {};

        ArraySorter.bubbleSort(input);

        assertArrayEquals(expected, input, "An empty array should remain empty.");
    }

    @Test
    void testBubbleSort_withNegativeNumbers() {
        // Test case: array with negative numbers
        int[] input = {-3, -1, -2, 0, 2, 1};
        int[] expected = {-3, -2, -1, 0, 1, 2};

        ArraySorter.bubbleSort(input);

        assertArrayEquals(expected, input, "The array with negative numbers should be sorted correctly.");
    }
}
