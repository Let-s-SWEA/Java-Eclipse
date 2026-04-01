// arr : [0, 0, 0, 1]
// idx : 1
// result : 3

package javaBasicCodingTraining.Day_11_리스트._05_가까운_1_찾기;

public class Solution {
	public int solution(int[] arr, int idx) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1 && i >= idx) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(new int[] { 1, 1, 1, 1, 0 }, 3);

		System.out.println(result);
	}
}