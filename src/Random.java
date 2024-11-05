import java.sql.Array;
import java.util.*;

public class Random {

    //two sum
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> records = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (records.containsKey(needed)) {
                return new int[] {records.get(needed), i};
            }
            records.put(nums[i], i);
        }
        return new int[] {};
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return results;

    }

//    public static List<List<Integer>> fourSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> results = new ArrayList<>();
//
//        for (int i = 0; i < nums.length - 3; i++) {
//            if (i > 0 && nums[i] == nums[i - 1]) continue;
//
//            for (int j = i + 1; j < nums.length - 2; j++) {
//                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
//
//                int left = i + 1;
//                int right = nums.length - 1;
//
//                while (left < right) {
//                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
//
//                    if (sum == 0) {
//                        results.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
//
//                        while (left < right && nums[left] == nums[left + 1]) left++;
//                        while (left < right && nums[right] == nums[right - 1]) right--;
//
//                        left++;
//                        right--;
//
//                    } else if (sum < 0) {
//                        left++;
//                    } else {
//                        right++;
//                    }
//
//                }
//
//            }
//
//        }
//        return results;
//    }

    public static int uniquePairsWithSum(int[] nums, int target) {
        HashMap<Integer, Integer> records = new HashMap<>();
        HashSet<List<Integer>> finalResult = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (records.containsKey(needed)) {
                List<Integer> pair = Arrays.asList(
                        Math.min(needed, nums[i]),
                        Math.max(needed, nums[i])
                );
                finalResult.add(pair);
            }
            records.put(nums[i],i);
        }

        return finalResult.size();

    }

}
