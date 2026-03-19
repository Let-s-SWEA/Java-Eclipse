// num_list : [2, 1, 6]
// result : [2, 1, 6, 5]

package javaBasicCodingTraining.Day_6_조건문_반복문._01_마지막_두_원소;

public class Solution {
	public int[] solution(int[] num_list) {
		int last = num_list[num_list.length - 1];
		int prev = num_list[num_list.length - 2];
		int[] answer = new int[num_list.length + 1];

		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
		}
		answer[answer.length - 1] = last > prev ? last - prev : last * 2;

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(new int[] { 2, 1, 6 });

		System.out.println(result);
	}
}
