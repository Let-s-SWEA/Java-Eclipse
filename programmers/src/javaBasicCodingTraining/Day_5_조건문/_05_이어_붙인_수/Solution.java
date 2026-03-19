// num_list : [3, 4, 5, 2, 1]
// result : 1

package javaBasicCodingTraining.Day_5_조건문._05_이어_붙인_수;

public class Solution {
	public int solution(int[] num_list) {
		StringBuilder oddNum = new StringBuilder();
		StringBuilder evenNum = new StringBuilder();

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 1) {
				oddNum.append(num_list[i]);
			} else {
				evenNum.append(num_list[i]);
			}
		}

		return Integer.parseInt(oddNum.toString()) + Integer.parseInt(evenNum.toString());
	}

	public int solution2(int[] num_list) {
		int odd = 0;
		int even = 0;

		for (int num : num_list) {
			if (num % 2 == 1) {
				odd = odd * 10 + num;
			} else {
				even = even * 10 + num;
			}
		}
		return odd + even;
	}
	
	public int solution3(int[] num_list) {
		StringBuilder oddNum = new StringBuilder();
		StringBuilder evenNum = new StringBuilder();

		for(int num : num_list ) {
			(num % 2 == 1 ? oddNum : evenNum).append(num);
		}

		return Integer.parseInt(oddNum.toString()) + Integer.parseInt(evenNum.toString());
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution3(new int[] { 3, 4, 5, 2, 1 });

		System.out.println(result);
	}
}