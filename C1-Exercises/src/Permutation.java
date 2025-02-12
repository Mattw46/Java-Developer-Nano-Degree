public class Permutation {

    // Method to print permutations of the array
    public static void printPermutn(int[] arr, int index) {
        // If we reach the end of the array, print the current permutation
        if (index == arr.length) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        // Loop through the array and swap elements
        for (int i = index; i < arr.length; i++) {
            // Swap the current element with the index
            swap(arr, index, i);

            // Recurse to the next element
            printPermutn(arr, index + 1);

            // Backtrack by swapping the elements back
            swap(arr, index, i);
        }
    }

    // Helper method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
