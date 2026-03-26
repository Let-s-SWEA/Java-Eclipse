// my_string : "rermgorpsam"
// queris : [[2, 3], [0, 7], [5, 9], [6, 10]]
// result : "programmers"

package javaBasicCodingTraining.Day_8_조건문_문자열._05_문자열_여러_번_뒤집기;

public class Solution {
	public String solution(String my_string, int[][] queries) {
		char[] arr = my_string.toCharArray();

		for (int[] query : queries) {
			char[] temp = new char[query[1] - query[0] + 1];
			int index = 0;

			for (int i = query[1]; i >= query[0]; i--) {
				temp[index++] = arr[i];
			}

			for (int j = query[0]; j <= query[1]; j++) {
				arr[j] = temp[j - query[0]];
			}
		}

		return new String(arr);
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution("rermgorpsam", new int[][] { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } });

		System.out.println(result);
	}
}