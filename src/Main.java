import helpers.SinglyLinkedList;
import helpers.Node;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] numbers = {2,7,11,15,24};
//        SlidingWindow.twoSum(numbers, 35);
//
//        int[] nums = {1,1,1,1,1,1,1,0,0,0,1,1,0,1,1,1};
//        int k = 2;
//        System.out.println(longestOnes(nums, k));
//        System.out.println(longestSubArray(nums));
//
//        int[] maxSum = {1,1,1,2,4,3,3,1,1};
//
//        int[] arr = {2, 1, 5, 1, 3, 2};
//        int ka = 3;
//        System.out.println("Maximum sum of subarray of size " + ka + ": " + maxSumOfSubArray(maxSum, ka));
//
//        String s = "ececeba";
//        int ke = 2;
//        System.out.println("Longest substring with at most " + ke + " distinct characters: " + longestSubstring(s, ke));
//
//        int[] numsss = {8, 3, 1, 2, 4, 2, 6, 2};
//        int target = 7;
//
//        // Find the length of the smallest subarray with a sum >= target
//        System.out.println("Minimum size subarray length: " + subArrayTarget(numsss, target));
//
//        String st = "abcdabcdebb";
//        // Find and print the length of the longest substring without repeating characters
//        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(st));
//
//        String s1 = "ab";
//        String s2 = "eidaoooba";
//        // Check if s2 contains a permutation of s1
//        System.out.println("Does s2 contain a permutation of s1? " + checkInclusionMap(s1, s2));
//
//        System.out.println(TwoPointers.isPalindrome("mala ya          s       ,lam"));

//        int[] nums = {1, 1, 2, 2, 2, 4};
//        int newLength = TwoPointers.removeDuplicates(nums);
//        System.out.println("New length: " + newLength);

        // Print the array up to the new length
//        for (int i = 0; i < newLength; i++) {
//            System.out.print(nums[i] + " ");
//        }

//        int[] ones = {1, 1, 1, 1};
//        System.out.println(SlidingWindow.longestOnesSubarray(nums));
//
//        int[] delZeros = {1,1,1,0,1,1,0,1,1,1,0};
//        System.out.println(SlidingWindow.longestAfterRemovingOne(delZeros));
//
//        char[] letters = {'a', 'b', 'c', 'd', 'g', 'b', 'a', 'b', 'c', 'b', 'b', 'a',  'd', 'g', 'a', 'o', 'p'};
//        System.out.println(SlidingWindow.longestSubstring(letters));  // Output: 3
//
//        System.out.println(SlidingWindow.maxSum(ones, 4));
//        System.out.println("novo " + SlidingWindow.longestSubstring(letters, 3));
//
//
//        System.out.println(SlidingWindow.minSubArrayLen(ones, 6));
//        System.out.println("-------");
//        System.out.println(SlidingWindow.longestOnesThree(delZeros, 1));
//
//        String s1 = "abcdxyz";
//        String s2 = "xyzabcd";
//        System.out.println("Length of Longest Common Substring: " + DynamicProgramming.longestSubString(s1, s2));
//
//
//        System.out.println("-------linked list stuff----------");

//        Node cycle = new Node(4);
//        SinglyLinkedList myList = new SinglyLinkedList(cycle);
        // Adding elements to the list
//        myList.append(2);
//        myList.append(2);
//        myList.append(4);
//        myList.append(cycle);
//        myList.printList();
//        System.out.println(myList.head.next.next.val);
//        myList.reverse();
//        myList.printList();


//        System.out.println(FastAndSlowPointer.hasCycle(myList));
//        System.out.println((FastAndSlowPointer.midOfTheList(myList.head)).val);

//        System.out.println(FastAndSlowPointer.isItAPalindrome(myList));


//        int[] numbs = {8, 3, 1, 2, 4, 5, 6, 2, 7, 3, 4};
//        int k = 7;
//        System.out.println(Random.uniquePairsWithSum(numbs, k));
//
//        System.out.println(Random.threeSum(numbs));
//        int[] numbss = {8, 3, 1, 2, 4, 3, 3, 2, 7, 3, 4};
//        System.out.println(SlidingWindow.maxSubarraySum(numbss, 4));
//        System.out.println(SlidingWindow.maxSumOfSubArray(numbss, 4));

//        int[] numsBrute = {2,3,7,7,11,2,15,35,16,16,3,11};
//        int target = 37;
//        System.out.println(Random.twoSumBrute(numsBrute, target));
//        System.out.println(Random.twoSumNonBrute(numsBrute, target));
//
//        System.out.println(Random.findAllPairs(numsBrute, 18));
//        System.out.println(Random.findAllPairsWithDuplicates(numsBrute, 18));
//
//        System.out.println(Random.findPairs(numsBrute, 18));
//
//        String x = "abcabcbb";
//        System.out.println(SlidingWindow.longestSubstringWithoutRepeating(x));
//        System.out.println(SlidingWindow.longestSubstringWithoutRepeatingUsingSet(x));

//        int[] numsTest = {2,3,7,7,11,2,15,35,16,16,3,11};
//        int[] numsSorted = Arrays.copyOf(numsTest, numsTest.length);
//        Arrays.sort(numsSorted);
//        int[] res = TwoPointers.twoSumSorted(numsSorted, 13);
//        System.out.println(Arrays.toString(res));
//        System.out.println(numsSorted[res[0]] + " and " + numsSorted[res[1]]);

//        int[] numsSortedMini = {-12,-3,-2,1,2,3,5};
//        System.out.println(Arrays.toString(TwoPointers.squaresOfSortedArray(numsSortedMini)));
//        System.out.println(Arrays.toString(TwoPointers.squaresOfSortedArray(numsSorted)));

//        String str = "ABABBBABB";
//        System.out.println(Random.characterReplacement(str, 1));

        String vowels = "EIoUaEaEEIIOOOOU";
        System.out.println(SlidingWindow.longestSubstringOfVowels(vowels));


    }
}