package DSA.DP;
// Max Product Subarray
// This implementation finds the maximum product of a contiguous subarray.
// Time Complexity: O(n) where n is the number of elements in the array

public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int left=1;
        int right=1;
        int result = nums[0];

        for(int i=0;i<nums.length;i++){
            if(left==0)
                left=1;
            if(right==0)
                right=1;
            
            left *= nums[i];
            right *= nums[nums.length - 1 - i];
            result = Math.max(result, Math.max(left, right));
        }

        

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product of subarray: " + maxProduct(nums));
    }
}
