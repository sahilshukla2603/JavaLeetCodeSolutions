package sahil.practice.java.Twosum;

/**
 * This code solution is not the efficient one, but this explains how to
 * approach the problem
 */
public class NormalSolution {
	// The input function receiving two arguments, one is input integer array,
	// and an integer "target"
	public int[] twoSum(int[] nums, int target) {
		/**
		 * First we need to run the loop on the entire array from start to end with
		 * index from 0 to length-1 and then again more loop inside this loop for
		 * finding the next value which will be making up the target value 
		 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					int[] arr = { i, j };
					return arr;
				}
			}
		}
		return new int[2]; // return the empty array
	}
}
