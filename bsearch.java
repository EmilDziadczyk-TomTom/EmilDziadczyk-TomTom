public class BinarySearch {
    // Returns the index of the target value in the array, or -1 if not found
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at the middle
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(array, target);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
