// my_string : "apporoograpemmemprs"
// indices :  [1, 16, 6, 15, 0, 10, 11, 3]
// result : "programmers"

package javaBasicCodingTraining.Day_11_리스트._03_글자_지우기;

public class Solution {
	public String solution(String my_string, int[] indices) {
		StringBuilder sb = new StringBuilder();
		boolean[] remove = new boolean[my_string.length()];

		for (int idx : indices) {
			remove[idx] = true;
		}

		for (int i = 0; i < my_string.length(); i++) {
			if (!remove[i]) {
				sb.append(my_string.charAt(i));
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution("apporoograpemmemprs", new int[] { 1, 16, 6, 15, 0, 10, 11, 3 });

		System.out.println(result);
	}
}