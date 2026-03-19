// code : "abc1abc1abc"
// result : "acbac" 

package javaBasicCodingTraining.Day_5_조건문._01_코드_처리하기;

public class Solution {

	// 첫 번째 시도
	public String solution(String code) {
		StringBuilder sb = new StringBuilder();
		char[] codeArr = code.toCharArray();

		boolean mode = false;

		for (int i = 0; i < code.length(); i++) {

			if (!mode) { // mode가 0일 때

				if (codeArr[i] == '1') { // code[idx]가 1일 때(문자로 비교함)
					mode = true;
				} else { // code[idx]가 1이 아니면서 짝수일 때
					if (i % 2 == 0) {
						sb.append(codeArr[i]);
					}
				}

			} else { // mode가 1일 때

				if (codeArr[i] == '1') { // code[idx]가 1일 때
					mode = false;
				} else { // code[idx]가 1이 아니면서 수일 때
					if (i % 2 == 1) {
						sb.append(codeArr[i]);
					}
				}

			}

		}

		if (sb.toString().length() == 0) {
			return "EMPTY";
		} else {
			return sb.toString();
		}
	}

	// 두 번째 시도
	public String solution2(String code) {
		StringBuilder sb = new StringBuilder();
		boolean mode = false;

		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);

			if (c == '1') {
				mode = !mode;
				continue;
			}

			if ((!mode && i % 2 == 0) || (mode && i % 2 == 1)) {
				sb.append(c);
			}
		}

		return sb.length() == 0 ? "EMPTY" : sb.toString();
	}

	// 다른 사람 답안
	public String solution3(String code) {
		StringBuilder answer = new StringBuilder();
		int mode = 0;

		for (int i = 0; i < code.length(); i++) {
			char current = code.charAt(i);
			if (current == '1') {
				mode = mode == 0 ? 1 : 0;
				continue;
			}

			if (i % 2 == mode) {
				answer.append(current);
			}
		}

		return answer.length() == 0 ? "EMPTY" : answer.toString();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution("abc1abc1abc");

		System.out.println(result);
	}
}