// my_string : "cvsgiorszzzmrpaqpe"
// index_list : [16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]
// result : "programmers"

package javaBasicCodingTraining.Day_8_조건문_문자열._03_글자_이어_붙여_문자열_만들기;

public class Solution {
	public String solution(String my_string, int[] index_list) {
		StringBuilder sb = new StringBuilder();
		char[] my_char = my_string.toCharArray();

		for (int i = 0; i < index_list.length; i++) {
			sb.append(my_char[index_list[i]]);
		}

		return sb.toString();
	}

	// 다른 사람의 더 잘된 코드
	public String solution2(String my_string, int[] index_list) {
		StringBuilder sb = new StringBuilder();

		for (int idx : index_list) {
			sb.append(my_string.charAt(idx));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution("cvsgiorszzzmrpaqpe", new int[] { 16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 });

		System.out.println(result);
	}
}