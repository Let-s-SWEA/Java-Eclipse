// my_string : "ProgrammerS123"
// n : 11
// result : "grammerS123"
// str.substring(a, b) : str의 a번째부터 b번째까지
// str.substring(a) : str의 a번째부터 끝까지

package javaBasicCodingTraining.Day_9_문자열._03_문자열의_뒤의_n글자;

public class Solution {
	public String solution(String my_string, int n) {
		return my_string.substring(my_string.length() - n);
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution("He110W0r1d", 5);

		System.out.println(result);
	}
}