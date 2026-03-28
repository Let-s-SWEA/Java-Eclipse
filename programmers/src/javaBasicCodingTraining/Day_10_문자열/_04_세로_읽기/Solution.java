// my_string : "ihrhbakrfpndopljhygc"
// m : 4
// c : 2
// result : "happy"

package javaBasicCodingTraining.Day_10_문자열._04_세로_읽기;

public class Solution {
	public String solution(String my_string, int m, int c) {
		StringBuilder sb = new StringBuilder();

		for (int i = c - 1; i < my_string.length(); i += m) {
			sb.append(my_string.charAt(i));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution("ihrhbakrfpndopljhygc", 4, 2);

		System.out.println(result);
	}
}
