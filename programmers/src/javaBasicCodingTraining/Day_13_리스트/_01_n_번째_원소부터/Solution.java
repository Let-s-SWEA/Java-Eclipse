// num_list : [2, 1, 6]
// n : 3
// result : [6]

package javaBasicCodingTraining.Day_13_리스트._01_n_번째_원소부터;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] num_list, int n) {
		return Arrays.copyOfRange(num_list, n - 1, num_list.length);
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(new int[] { 5, 2, 1, 7, 5 }, 2);

		System.out.println(Arrays.toString(result));
	}
}