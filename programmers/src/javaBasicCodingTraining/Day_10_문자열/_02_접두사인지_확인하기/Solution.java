// my_string : "banana"
// is_prefix : "ban"
// result : 1

// my_string : "banana"
// is_prefix : "nan"
// result : 1

package javaBasicCodingTraining.Day_10_문자열._02_접두사인지_확인하기;

public class Solution {
	public int solution(String my_string, String is_prefix) {

		if (my_string.startsWith(is_prefix))	return 1;
		else	return 0;

	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution("banana", "nan");

		System.out.println(result);
	}
}