// num_list : [4, 2, 6, 1, 7, 6]
// result : 17

package javaBasicCodingTraining.Day_14_리스트._01_홀수_vs_짝수;

class Solution {
	public int solution(int[] num_list) {
		int oddNum = 0;
		int evenNum = 0;

		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				oddNum += num_list[i];
			} else {
				evenNum += num_list[i];
			}
		}

		return Math.max(oddNum, evenNum);
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(new int[] { 4, 2, 6, 1, 7, 6 });

		System.out.println(result);
	}
}