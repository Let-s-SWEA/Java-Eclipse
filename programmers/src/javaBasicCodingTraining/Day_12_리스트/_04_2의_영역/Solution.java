// arr : [1, 2, 1, 4, 5, 2, 9] | result : [2, 1, 4, 5, 2]
// arr : [1, 2, 1] | result : [2]
// arr : [1, 1, 1] | result : [-1]

package javaBasicCodingTraining.Day_12_리스트._04_2의_영역;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				list.add(i);
			}
		}

		if (list.isEmpty())
			return new int[] { -1 };

		int startIdx = list.get(0); // 1
		int endIdx = list.get(list.size() - 1); // 6
		int size = endIdx - startIdx + 1;
		int[] answer = new int[size]; // 6 - 1 + 1 = 6

		System.arraycopy(arr, startIdx, answer, 0, size);

		return answer;
	}
	
	// 더 최적화된 코드
	public int[] solution2(int[] arr) {
		int startIdx = -1;
		int endIdx = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 2) {
				if(startIdx == -1) {
					startIdx = i;
				}
				endIdx = i;
			}
		}
		
		if (startIdx == -1) {
			return new int[] {-1};
		}
		
		int[] answer = new int[endIdx - startIdx + 1];
		System.arraycopy(arr, startIdx, answer, 0, answer.length);
		
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution2(new int[] { 1, 2, 1, 2, 1, 10, 2, 1 });

		System.out.println(Arrays.toString(result));
	}
}