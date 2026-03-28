// my_string : "Progra21Sremm3"
// s : 6
// e : 12
// result : "ProgrammerS123"

package javaBasicCodingTraining.Day_10_문자열._03_문자열_뒤집기;

public class Solution {
	public String solution(String my_string, int s, int e) {
		StringBuilder sb = new StringBuilder(my_string);
		String reverse = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();

		for (int i = s; i <= e; i++) {
			sb.setCharAt(i, reverse.charAt(i - s));
		}

		return sb.toString();
	}

	// GPT 풀
	public String solution2(String my_string, int s, int e) {
		StringBuilder sb = new StringBuilder(my_string);

		while (s < e) {
			char temp = sb.charAt(s);
			sb.setCharAt(s, sb.charAt(e));
			sb.setCharAt(e, temp);
			s++;
			e--;
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution2("Progra21Sremm3", 6, 12);

		System.out.println(result);
	}
}