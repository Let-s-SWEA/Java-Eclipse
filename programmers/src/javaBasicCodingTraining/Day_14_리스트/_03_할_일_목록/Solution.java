// 
// 

package javaBasicCodingTraining.Day_14_리스트._03_할_일_목록;

import java.util.Arrays;

class Solution {
	public String[] solution(String[] todo_list, boolean[] finished) {
		int count = 0;

		for (int i = 0; i < finished.length; i++) {
			if (!finished[i]) {
				count++;
			}
		}

		String[] answer = new String[count];

		for (int j = 0, idx = 0; j < todo_list.length; j++) {
			if (!finished[j]) {
				answer[idx++] = todo_list[j];
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String[] result = sol.solution(
				new String[] { "problemsolving", "practiceguitar", "swim", "studygraph" },
				new boolean[] { true, false, true, false }
		);

		System.out.println(Arrays.toString(result));
	}
}