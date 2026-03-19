// arr : [0, 1, 2, 4, 3]
// queries : [[0, 4, 2],[0, 3, 2],[0, 2, 2]]
// result : [3, 4, -1]

package javaBasicCodingTraining.Day_6_조건문_반복문._05_수열과_구간_쿼리_2;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];

			int min = 1000000;

			for (int j = s; j <= e; j++) {
				if (arr[j] > k && arr[j] < min) {
					min = arr[j];
				}
			}
			answer[i] = (min == 1000000) ? -1 : min;
		}

		return answer;
	}

	// 다른 사람 풀이 + 내 생각
	public int[] solution2(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		Arrays.fill(answer, -1);

		for (int idx = 0; idx < queries.length; idx++) {
			int s = queries[idx][0];
			int e = queries[idx][1];
			int k = queries[idx][2];

			for (int i = s; i <= e; i++) {
				if (k < arr[i]) {
					answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(new int[] { 0, 1, 2, 4, 3 }, new int[][] { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } });

		System.out.println(Arrays.toString(result));
	}
}
