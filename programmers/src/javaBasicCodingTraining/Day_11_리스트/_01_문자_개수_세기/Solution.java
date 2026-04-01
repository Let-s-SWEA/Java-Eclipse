// my_string : "Programmers"
// result :  
//   [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]

package javaBasicCodingTraining.Day_11_리스트._01_문자_개수_세기;

import java.util.Arrays;

public class Solution {
	public int[] solution(String my_string) {
		int[] answer = new int[52];

		for (char alphabet : my_string.toCharArray()) {
			if (alphabet >= 'A' && alphabet <= 'Z') {
				answer[alphabet - 'A']++;
			} else if (alphabet >= 'a' && alphabet <= 'z') {
				answer[alphabet - 'a' + 26]++;
			}
		}

		return answer;
	}

	// 다른 사람 풀이
	public int[] solution2(String my_string) {
		int[] answer = new int[52];

		for (char alphabet : my_string.toCharArray()) {
			answer[alphabet - 'A' - (Character.isLowerCase(alphabet) ? 6 : 0)]++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution("Programmers");

		System.out.println(Arrays.toString(result));
	}
}