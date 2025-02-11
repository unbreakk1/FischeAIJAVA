﻿package unbreakk1;

public class ArraySorter
{

    public static void main(String[] args)
    {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Original array:");
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }

        bubbleSort(numbers);

        System.out.println("\nSorted array:");
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
    }

    public static void bubbleSort(int[] array)
    {
        int length = array.length;
        boolean swapped;

        do
        {
            swapped = false;

            for (int i = 1; i < length; i++)
            {
                if (array[i - 1] > array[i])
                {
                    swap(array, i - 1, i);
                    swapped = true;
                }
            }
            length--;
        } while (swapped);
    }

    private static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
