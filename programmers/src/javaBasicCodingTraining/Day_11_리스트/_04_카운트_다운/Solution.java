// start_num : 10
// end_num : 3
// result : [10, 9, 8, 7, 6, 5, 4, 3]

package javaBasicCodingTraining.Day_11_리스트._04_카운트_다운;

import java.util.Arrays;

public class Solution {
	public int[] solution(int start_num, int end_num) {
		int[] answer = new int[start_num - end_num + 1];

		for (int i = start_num; i >= end_num; i--) {
			answer[start_num - i] = i;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(10, 3);

		System.out.println(Arrays.toString(result));
	}
}