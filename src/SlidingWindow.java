import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SlidingWindow {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static int longestOnes(int[] nums, int k) {
        int result = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 0) k--;
            while (k < 0) {
                if (nums[j] == 0) k++;
                j++;
            }
            result = Math.max(result, i - j + 1);
        }
        return result;
    }

    //leetcode 1493
    public static int longestSubArray(int[] nums) {
        int result = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                result = Math.max(result, i - j);
            }
            if (nums[i] == 0) {
                j = i;
            }
        }
        return result;
    }

    public static int maxSumOfSubArray(int[] nums, int k) {
        int curSum = 0;
        int maxSum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            curSum += nums[end];

            if (end >= k - 1) {
                maxSum = Math.max(curSum, maxSum);
                curSum -= nums[start];
                start++;
            }
        }


        return maxSum;
    }


    public static int longestSubstring(String s, int k) {
        if (k == 0) return 0;

        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);

            charCount.put(endChar, charCount.getOrDefault(endChar,0) + 1);

            while (charCount.size() > k) {
                char startChar = s.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);
                if (charCount.get(startChar) == 0) {
                    charCount.remove(startChar);
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);

        }
        return maxLength;
    }


    public static int subArrayTarget(int[] niz, int target) {

        int start = 0;
        int currentSum = 0;

        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < niz.length; end++ ) {
            currentSum += niz[end];

            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= niz[start];
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }



    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int end = 0; end < s.length(); end ++) {
            char endChar = s.charAt(end);


            while (charSet.contains(endChar)) {
                charSet.remove(s.charAt(start));
                start++;
            }

            charSet.add(endChar);

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }


    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int end = s1.length();

        for (int start = 0; start < s2.length() - s1.length() + 1; start++) {
            System.out.println(start + " - start");
            System.out.println(end + " - end");
            String str = s2.substring(start, end);
            char[] characters2 = str.toCharArray();
            Arrays.sort(characters2);
            char[] characters1 = s1.toCharArray();
            Arrays.sort(characters1);
            System.out.println(characters2);
            System.out.println(characters1);
            end++;
        }

        return false;
    }


    public static boolean checkInclusionMap(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> s1map = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (char c: s1.toCharArray()) {
            s1map.put(c, s1map.getOrDefault(c, 0) + 1);
        }

        for (int start = 0; start < s2.length(); start++) {
            char current = s2.charAt(start);
            windowMap.put(current, windowMap.getOrDefault(current, 0) + 1);

            while (windowMap.size() > s1.length()) {
                char first = s2.charAt(start - s1.length());
                windowMap.put(first, windowMap.get(first) - 1);
                if (windowMap.get(first) == 0) {
                    windowMap.remove(first);
                }
            }

            if (windowMap.equals(s1map)){
                return true;
            }
        }
        return false;
    }

    public static int longestOnesSubarray(int[] niz) {
        int count = 0;
        int c = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == 1) {
                c++;
            } else {
                count = Math.max(count, c);
                c = 0;
            }
        }

        return count;

    }

    public static int longestAfterRemovingOne(int[] niz) {
        int left = 0;
        int zeros = 0;
        int count = 0;

        for (int right = 0; right < niz.length; right++) {
            if (niz[right] == 0) {
                zeros++;
            }

            while (zeros > 1) {
                if (niz[left] == 0) {
                    zeros--;
                }
                left++;
            }
            count = Math.max(count, right - left);
        }
        return count;
    }

    public static int longestSubstring(char[] letters) {
        int left = 0;
        HashSet uniqueLetters = new HashSet<>();
        int longest = 0;

        for (int right = 0; right < letters.length; right++) {
            while (uniqueLetters.contains(letters[right])) {
                uniqueLetters.remove(letters[left]);
                left++;
            }
            uniqueLetters.add(letters[right]);
            longest = Math.max(longest, right - left + 1);

        }
        return longest;
    }


    public static int maxSum(int[] nums, int k) {
        int i = 0;
        int curSum = 0;
        int maxSum = 0;

        for (int j = 0; j < nums.length; j++) {
            curSum += nums[j];
            if (j - i + 1 == k) {
                maxSum = Math.max(curSum, maxSum);
                curSum -= nums[i];
                i++;
            }
        }
        return maxSum;
    }

    public static int longestSubstring(char[] arr, int k) {
        if (arr == null || arr.length == 0 || k == 0) return 0;

        int i = 0;
        Map<Character, Integer> distinct = new HashMap<>();
        int counter = 0;

        for (int j = 0; j < arr.length; j++) {
            char current = arr[j];
            distinct.put(current, distinct.getOrDefault(current, 0) + 1);
            while (distinct.size() > k) {
                distinct.put(arr[i], distinct.get(arr[i]) - 1);
                if (distinct.get(arr[i]) == 0) {
                    distinct.remove(arr[i]);
                }
                i++;
            }
            counter = Math.max(counter, j - i + 1);
        }
        return counter;
    }


    public static int minSubArrayLen(int[] arr, int k) {
        int i = 0;
        int count = arr.length;
        int curSum = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] >= k) return count = 1;

            curSum += arr[j];

            while (curSum >= k) {
                count = Math.min(count, j - i + 1);
                curSum -= arr[i];
                i++;
            }
        }

        if (count == arr.length) {
            return 0;
        } else {
            return count;
        }


    }

    //leetcode 1004
    public static int longestOnesThree(int[] A, int K) {
        int i = 0;
        int maxLength = 0;

        for (int j = 0; j < A.length; j++) {
            if (A[j] == 0) {
                K--;
            }

            while (K < 0) {
                if (A[i] == 0) {
                    K++;
                }
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }




}
