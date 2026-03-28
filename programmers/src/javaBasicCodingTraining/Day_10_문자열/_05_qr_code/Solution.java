// q : 3
// r : 1
// code : "qjnwezgrpirldywt"
// result : "jerry"

package javaBasicCodingTraining.Day_10_문자열._05_qr_code;

public class Solution {
	public String solution(int q, int r, String code) {
		StringBuilder sb = new StringBuilder();

		for (int i = r; i < code.length(); i += q) {
			sb.append(code.charAt(i));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution(3, 1, "qjnwezgrpirldywt");

		System.out.println(result);
	}
}