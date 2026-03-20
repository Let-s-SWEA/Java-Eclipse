// start_num : 3
// end_num : 10
// result : [3, 4, 5, 6, 7, 8, 9, 10]

package javaBasicCodingTraining.Day_7_반복문._03_카운트_업;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
	public int[] solution(int start_num, int end_num) {
		List<Integer> list = new ArrayList<>();

		for (int i = start_num; i <= end_num; i++) {
			list.add(i);
		}

		return list.stream().mapToInt(i -> i).toArray();
	}

	// 더 나은 다른 사람 풀이
	public int[] solution2(int start_num, int end_num) {
		int range = end_num - start_num;
		int[] answer = new int[range + 1];

		for (int i = 0; i <= range; i++) {
			answer[i] = start_num + i;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution2(3, 10);

		System.out.println(Arrays.toString(result));
	}
}