// arr : [0, 1, 2, 3, 4, 5]
// query : [4, 1, 2]
// result : [1, 2, 3]

package javaBasicCodingTraining.Day_12_리스트._05_배열_조각하기;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] arr, int[] query) {
		for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) {	
				arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
			} else if (i % 2 == 1) {
				arr = Arrays.copyOfRange(arr, query[i], arr.length);
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(new int[] { 0, 1, 2, 3, 4, 5 }, new int[] { 4, 1, 2 });

		System.out.println(Arrays.toString(result));
	}
}