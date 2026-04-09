package javaBasicCodingTraining.Day_14_리스트._04_n보다_커질_때까지_더하기;

class Solution {
	public int solution(int[] numbers, int n) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

			if (sum > n) {
				return sum;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(new int[] { 34, 5, 71, 29, 100, 34 }, 123);

		System.out.println(result);
	}
}