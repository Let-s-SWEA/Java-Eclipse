// my_string : "banana"
// is_suffix : "ana" | result : 1
// is_suffix : "nan" | result : 0

package javaBasicCodingTraining.Day_9_문자열._05_접미사인지_확인하기;

public class Solution {
	public int solution(String my_string, String is_suffix) {
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.substring(i).equals(is_suffix)) {
				return 1;
			}
		}
		return 0;
	}
	
	// 다른 사람 풀이
	public int solution2(String my_string, String is_suffix) {
		if(my_string.endsWith(is_suffix)) return 1;
		else return 0;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution2("banana", "ana");

		System.out.println(result);
	}
}