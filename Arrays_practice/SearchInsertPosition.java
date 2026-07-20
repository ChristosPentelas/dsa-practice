package Arrays_practice;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;

        int index = Arrays.binarySearch(nums, target);
        System.out.println(index>=0 ? index : -index-1);
    }
}
