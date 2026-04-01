// n : 10
// k : 3
// result : [3, 6, 9]

package javaBasicCodingTraining.Day_11_리스트._02_배열_만들기_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int[] solution(int n, int k) {
		List<Integer> answer = new ArrayList<>();

		for (int i = k; i <= n; i += k) {
			answer.add(i);
		}

		return answer.stream().mapToInt(i -> i).toArray();
	}

	// 다른 풀이
	public int[] solution2(int n, int k) {
		int size = n / k;
		int[] answer = new int[size];

		for (int i = 1; i <= size; i++) {
			answer[i - 1] = i * k;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(15, 5);

		System.out.println(Arrays.toString(result));
	}
}