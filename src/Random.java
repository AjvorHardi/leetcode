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
