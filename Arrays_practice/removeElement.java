package Arrays_practice;

import java.util.Arrays;

import static java.util.Arrays.*;


public class removeElement {

    public static int removeElement(int[] nums,int val) {
        int k=0;

        for (int i=0;i<nums.length;i++) {
            if (nums[i]!=val) {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int[] expectedNums = {2,2};

        int k = removeElement(nums,val);

        sort(nums,0,k);
        boolean passed = (k == expectedNums.length);

        for (int i = 0; i < k; i++) {
            if (nums[i] != expectedNums[i]) {
                passed = false;
                break;
            }
        }

        System.out.println("Test passed: " + passed);
        System.out.println("Array: " + Arrays.toString(nums));
    }
}
