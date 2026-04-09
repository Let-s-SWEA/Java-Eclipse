// names : ["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]
// result : ["nami", "vex"]

package javaBasicCodingTraining.Day_14_리스트._02_5명씩;

import java.util.Arrays;

class Solution {
	public String[] solution(String[] names) {
		String[] answer = new String[(names.length + 4) / 5];

		for (int i = 0, idx = 0; i < names.length; i += 5) {
			answer[idx++] = names[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String[] result = sol.solution(new String[] { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" });

		System.out.println(Arrays.toString(result));
	}
}