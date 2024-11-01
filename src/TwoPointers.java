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


    //leetcode 2938
//    public long minimumSteps(String s) {
//
//
//    }
}