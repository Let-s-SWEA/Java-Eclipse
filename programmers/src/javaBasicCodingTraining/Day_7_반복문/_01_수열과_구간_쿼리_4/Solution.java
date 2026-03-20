// arr : [0, 1, 2, 4, 3]
// queries : [[0, 4, 1], [0, 3, 2], [0, 3, 3]]
// result : [ 3, 2, 4, 6, 4]

package javaBasicCodingTraining.Day_7_반복문._01_수열과_구간_쿼리_4;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] arr, int[][] queries) {

		for (int[] query : queries) {
			int s = query[0];
			int e = query[1];
			int k = query[2];

			for (int i = s; i <= e; i++) {
				if (i % k == 0) {
					arr[i] += 1;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(new int[] { 0, 1, 2, 4, 3 }, new int[][] { { 0, 4, 1 }, { 0, 3, 2 }, { 0, 3, 3 } });

		System.out.println(Arrays.toString(result));
	}
}