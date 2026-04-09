package javaBasicCodingTraining.Day_14_리스트._05_수열과_구간_쿼리_1;

import java.util.Arrays;

class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		for (int[] query : queries) {
			for (int i = query[0]; i <= query[1]; i++) {
				arr[i]++;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(new int[] { 0, 1, 2, 3, 4 }, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 } });

		System.out.println(Arrays.toString(result));
	}
}