package Codes;

public class FreqImpl {


    // Binary search implementation to find the first occurrence of a target element
    public static int findFirstOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int firstOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                firstOccurrence = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return firstOccurrence;
    }

    // Binary search implementation to find the last occurrence of a target element
    public static int findLastOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lastOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                lastOccurrence = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return lastOccurrence;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 4, 5, 5, 5, 5, 5, 5, 5};
        int num = 5;
        int firstOccurrence = findFirstOccurrence(nums, num);

        if (firstOccurrence == -1) {
            System.out.println(" Target element not found, return 0 occurrences");
        }

        int lastOccurrence = findLastOccurrence(nums, num);

        int freqCount = lastOccurrence - firstOccurrence + 1;


        System.out.println("The occurrence of " + num + " is: " + freqCount);
    }
}
