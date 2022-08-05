public class BinarySearch {
    public static int findTarget(int[] arr, int target) {
        int returnValue = -1;
        int startIndex = 0;
        int endIndex = arr.length -1;
        int middle = arr[arr.length /2];

        while (startIndex < endIndex && endIndex > startIndex) {
            middle = (endIndex - startIndex) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            else if (arr[middle] < target) {
                startIndex = middle + 1;
            }
            else {
                endIndex = middle - 1;
            }
        }

        return returnValue;
    }
}
