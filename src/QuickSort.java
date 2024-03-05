/*
 * Created on 2024-03-04
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

public class QuickSort {

    public static void sort(Cat[] array, int left, int right) {
        if (left < right) {
            // Partitioning index of current pivot element
            int partitioningIndex = partition(array, left, right);

            // Sort elements before partition and after partition
            // Preview: A method calling itself is called "recursion"
            // More about that soon!
            sort(array, left, partitioningIndex - 1);
            sort(array, partitioningIndex + 1, right);
        }
    }

    private static int partition(Cat[] array, int left, int right) {
        // TODO: Select the pivot element
        Cat pivot = null;

        int i = left - 1;
        // Reorder the array
        for (int j = left; j < right; j++) {
            if (array[j].getAge() <= pivot.getAge()) {
                i++;
                Cat temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // TODO: Place pivot element at right position in the array

        // All elements to the left of the pivot are less than or equal to the pivot
        // All elements to the right of the pivot are greater than the pivot
        // Returns the index of the pivot element
        return i + 1;
    }
}
