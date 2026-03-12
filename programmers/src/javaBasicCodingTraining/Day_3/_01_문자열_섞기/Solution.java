// input str1 : "aaaaa"
// input str2 : "bbbbb"
// output result : "ababababab"

package javaBasicCodingTraining.Day_3._01_문자열_섞기;

class Solution {
	public String solution1(String str1, String str2) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {
			sb.append(str1.charAt(i)).append(str2.charAt(i));
		}
		
		String result = sb.toString();
		
		return result;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result1 = sol.solution1("aaaaa", "bbbbb");

		System.out.println(result1);
	}
}