// my_strings[i] : ["progressive", "hamburger", "hammer", "ahocorasick"]
// parts[i] : [[0, 4], [1, 2], [3, 5], [7, 7]]
// 부분 문자열 : "progr"

package javaBasicCodingTraining.Day_9_문자열._02_부분_문자열_이어_붙여_문자열_만들기;

public class Solution {
	public String solution(String[] my_strings, int[][] parts) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < my_strings.length; i++) {
			for (int j = parts[i][0]; j <= parts[i][1]; j++) {
				sb.append(my_strings[i].charAt(j));
			}
		}

		return sb.toString();
	}

	// 다른 사람 코
	public String solution2(String[] my_strings, int[][] parts) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < my_strings.length; i++) {
			sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution2(
				new String[] { "progressive", "hamburger", "hammer", "ahocorasick" },
				new int[][] { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } }
		);

		System.out.println(result);
	}
}