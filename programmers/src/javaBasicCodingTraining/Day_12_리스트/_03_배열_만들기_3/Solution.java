// arr : [1, 2, 3, 4, 5]
// intervals : [[1, 3], [0, 4]]
// results : [2, 3, 4, 1, 2, 3, 4, 5]

package javaBasicCodingTraining.Day_12_리스트._03_배열_만들기_3;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] arr, int[][] intervals) {		
		int[] a = new int[] { intervals[0][0], intervals[0][1] };
		int[] b = new int[] { intervals[1][0], intervals[1][1] };

		int size1 = (a[1] - a[0]) + 1; // 3 - 1 + 1 = 3
		int size2 = (b[1] - b[0]) + 1; // 4 - 0 + 1 = 5

		int[] temp1 = new int[size1];
		int[] temp2 = new int[size2];
		int[] answer = new int[size1 + size2];

		for (int i = 0; i < size1; i++) { // 0, 1, 2
			temp1[i] = arr[i + a[0]];
			System.out.println(Arrays.toString(temp1));
		}

		for (int i = 0; i < size1; i++) {
			answer[i] = temp1[i];
		}

		System.out.println("---------");

		for (int j = 0; j < size2; j++) {
			temp2[j] = arr[j + b[0]];
			System.out.println(Arrays.toString(temp2));
		}

		for (int j = 0; j < size2; j++) {
			answer[j + size1] = temp2[j];

		}

		return answer;
	}
	
	// 개선된 코드
	public int[] solution2(int[] arr, int[][] intervals) {
		int start1 = intervals[0][0];
		int end1 = intervals[0][1];
		int start2 = intervals[1][0];
		int end2 = intervals[1][1];
		
		int size1 = end1 - start1 + 1;
		int size2 = end2 - start2 + 1;
		
		int[] answer = new int[size1 + size2];
		
		// System.arraycopy(원본 배열, 복사 시작 위치, 복사 받을 배열, 붙여넣기 시작 위치, 복사할 개수)
		System.arraycopy(arr, start1, answer, 0, size1);
		System.arraycopy(arr, start2, answer, size1, size2);
		
		return answer;
	}

	public static void main(String[] args) {
		
		Solution sol = new Solution();

		int[] result = sol.solution2(new int[] { 1, 2, 3, 4, 5 }, new int[][] { { 1, 3 }, { 0, 4 } });
		
		System.out.println("---------------");

		System.out.println(Arrays.toString(result));
	}
}