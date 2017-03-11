package leetcode_26_remove_duplicates_from_sorted_array;

public class Solution {
	public static int removeDuplicates(int[] nums) {
        int result = 1;
        
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;  
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    nums[result] = nums[i + 1];
                    result++;
                }
            }
        }
        
        return result;
    }
}
