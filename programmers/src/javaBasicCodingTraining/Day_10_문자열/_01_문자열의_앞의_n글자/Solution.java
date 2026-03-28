// my_string : "ProgrammerS123"
// n : 11
// result : "ProgammerS"

// my_string : "He110W0r1d"
// n : 5
// result : "He110"

package javaBasicCodingTraining.Day_10_문자열._01_문자열의_앞의_n글자;

public class Solution{
	public String solution(String my_string, int n) {
		return my_string.substring(0, n);
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		String result = sol.solution("ProgrammerS123", 11);
		
		System.out.println(result);
	}
}