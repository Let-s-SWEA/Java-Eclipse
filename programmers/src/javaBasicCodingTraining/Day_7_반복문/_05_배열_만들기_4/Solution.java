// arr : [1, 4, 2, 5, 3]
// result : [1, 2, 3]
// 기회가 되면 Deque로 풀어보자...

package javaBasicCodingTraining.Day_7_반복문._05_배열_만들기_4;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
	public int[] solution(int[] arr) {
		int[] stk = new int[arr.length];
		int size = 0;

		for (int idx = 0; idx < arr.length; idx++) {
			if (size == 0) {
				stk[size++] = arr[idx]; // stk[0]에 먼저 값 넣고 size++
			} else if (stk[size - 1] < arr[idx]) {
				stk[size++] = arr[idx];
			} else {
				size--;
				idx--;
			}
		}

		return Arrays.copyOf(stk, size);
	}

	public int[] solution2(int[] arr) {
		List<Integer> stk = new ArrayList<>();

		for (int idx = 0; idx < arr.length; idx++) {
			if (stk.isEmpty()) {
				stk.add(arr[idx]);
			} else if (stk.get(stk.size() - 1) < arr[idx]) {
				stk.add(arr[idx]);
			} else {
				stk.remove(stk.size() - 1);
				idx--;
			}
		}
		
		return stk.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution2(new int[] { 1, 4, 2, 5, 3 });

		System.out.println(Arrays.toString(result));
	}
}