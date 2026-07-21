package Hash_Table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];

            if (map.containsKey(com)) {
                return new int[]{map.get(com), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] sum = twoSum(nums, target);

        System.out.println(Arrays.toString(sum));
    }
}
