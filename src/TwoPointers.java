import java.util.Arrays;

public class TwoPointers {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }

        }

        return true;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int[] twoSumSorted(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        //so if it wasn't sorted, I would use a map
        //but since it is, there's probably a better way

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }


    public static int[] squaresOfSortedArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        int[] squared = new int[arr.length];
        int counter = arr.length - 1;

        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (leftSquare <= rightSquare) {
                squared[counter] = rightSquare;
                right--;
            } else {
                squared[counter] = leftSquare;
                left++;
            }
            counter--;
        }
        return squared;
    }


    //leetcode 2938
//    public long minimumSteps(String s) {
//
//
//    }
}