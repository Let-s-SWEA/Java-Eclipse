// my_string input : "He11oWor1d"
// overwrite_string input : "lloWorl"
// output : "HelloWorld"

package javaBasicCodingTraining.Day_2._05_문자열_겹쳐쓰기;

class Solution {
	public String solution1(String my_string, String overwrite_string, int s) {
		char[] answer = my_string.toCharArray();

		for (int i = 0; i < overwrite_string.length(); i++) {
			answer[s + i] = overwrite_string.charAt(i);
		}
		
		return new String(answer);
	}
	
	// 실무에서는 이거를 더 많이 사용할 듯...?
	public String solution2(String my_string, String overwrite_string, int s) {
		String before = my_string.substring(0, s);
		String after = my_string.substring(s + overwrite_string.length());
		return before + overwrite_string + after;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		String result1 = sol.solution1("He11oWorld", "lloWorl", 2);
		String result2 = sol.solution1("He11oWorld", "lloWorl", 2);
		
		System.out.println(result2);
	}
}