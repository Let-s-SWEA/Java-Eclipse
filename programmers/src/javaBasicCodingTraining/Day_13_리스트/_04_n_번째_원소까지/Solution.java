// num_list : [2, 1, 6]
// n : 1
// result : [2]

package javaBasicCodingTraining.Day_13_리스트._04_n_번째_원소까지;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[n];
		System.arraycopy(num_list, 0, answer, 0, n);

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(new int[] { 5, 2, 1, 7, 5 }, 3);

		System.out.println(Arrays.toString(result));
	}
}