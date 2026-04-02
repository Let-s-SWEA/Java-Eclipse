// n : 3
// slicer : [1, 5, 2]
// num_list : [1, 2, 3, 4, 5, 6, 7, 8, 9]

package javaBasicCodingTraining.Day_12_리스트._01_리스트_자르기;

import java.util.Arrays;

public class Solution {
	public int[] solution(int n, int[] slicer, int[] num_list) {
		int a = slicer[0];
		int b = slicer[1];
		int c = slicer[2];

		switch (n) {
		case 1:
			int[] case1 = new int[b + 1];

			for (int i = 0; i <= b; i++) { // 0 ~ 5
				case1[i] = num_list[i];
			}
			return case1;
		case 2:
			int size2 = num_list.length - a; // 9 - 1 = 8
			int[] case2 = new int[size2];

			for (int i = 0; i < size2; i++) { // 0 ~ 8
				case2[i] = num_list[i + a];
			}

			return case2;
		case 3:
			int size3 = b - a + 1; // 5 - 1 + 1 = 5
			int[] case3 = new int[size3];

			for (int i = 0; i < size3; i++) {
				case3[i] = num_list[i + a];
			}
			return case3;
		case 4:
			int size4 = (b - a + 1) / c + 1; // (5 - 1 + 1) / 2 = 2
			int[] case4 = new int[size4];
			int idx = 0;

			for (int i = a; i <= b; i += c) {
				case4[idx++] = num_list[i];
			}
			return case4;
		default:
			return new int[0];
		}
	}

	// 다른 풀이
	public int[] solution2(int n, int[] slicer, int[] num_list) {
		int a = slicer[0];
		int b = slicer[1];
		int c = slicer[2];

		switch (n) {
		case 1:
			return Arrays.copyOfRange(num_list, 0, b + 1);
		case 2:
			return Arrays.copyOfRange(num_list, a, num_list.length);
		case 3:
			return Arrays.copyOfRange(num_list, a, b + 1);
		case 4:
			int size = ((b - a) / c) + 1;
			int[] answer = new int[size];
			int idx = 0;

			for (int i = a; i <= b; i += c) {
				answer[idx++] = num_list[i];
			}
			return answer;
		default:
			return new int[0];
		}
	}
	
	// 다른 사람 풀이
	public int[] solution3(int n, int[] slicer, int[] num_list) {
		int start = n == 1 ? 0 : slicer[0];
		int end = n == 2 ? num_list.length - 1: slicer[1];
		int step = n == 4 ? slicer[2] : 1;
		
		int[] answer = new int[(end - start + step) / step];
		
		for(int i = start, j = 0; i <= end; i += step) {
			answer[j++] = num_list[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution3(3, new int[] { 1, 5, 2 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });

		System.out.println(Arrays.toString(result));
	}
}