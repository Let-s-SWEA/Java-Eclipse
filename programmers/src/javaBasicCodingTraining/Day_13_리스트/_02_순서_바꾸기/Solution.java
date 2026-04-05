// num_list : [2, 1, 6]
// n : 1
// result : [1, 6, 2]

package javaBasicCodingTraining.Day_13_리스트._02_순서_바꾸기;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] temp = Arrays.copyOf(num_list, n);
		System.arraycopy(num_list, n, num_list, 0, num_list.length - n);
		System.arraycopy(temp, 0, num_list, num_list.length - n, n);

		return num_list;
	}

	// 보통 매개변수(원본)을 안 건드린데요
	public int[] solution2(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		System.arraycopy(num_list, n, answer, 0, num_list.length - n);
		System.arraycopy(num_list, 0, answer, num_list.length - n, n);

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution2(new int[] { 2, 1, 6 }, 1);

		System.out.println(Arrays.toString(result));
	}
}