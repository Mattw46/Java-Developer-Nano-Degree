public class BinarySearch {
    /* Search for the target in a sorted array, and return the index.
    *  If the target is not in this array, return -1 */
    public static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int index = start + (end - start) / 2;

            // Check if target is found
            if (arr[index] == target) {
                return index;
            }

            // If the target is smaller than mid, search first half
            if (arr[index] > target) {
                end = index -1;
            }
            // Otherwise, search the first half
            else {
                start = index + 1;
            }
        }

        // Return -1 if the target is not found in the array
        return -1;
    }
}
