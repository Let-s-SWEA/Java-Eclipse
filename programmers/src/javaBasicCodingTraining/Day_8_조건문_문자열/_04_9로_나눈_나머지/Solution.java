// number : "123"
// result : 6

// number : "78720646226947352489"
// result : 2

package javaBasicCodingTraining.Day_8_조건문_문자열._04_9로_나눈_나머지;

import java.util.Arrays;

public class Solution {
	public int solution(String number) {
		StringBuilder sb = new StringBuilder();
		int[] numArr = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
		int sum = 0;

		for (int num : numArr) {
			sum += num;
		}

		return sum % 9;
	}

	public int solution2(String number) {
		return number.chars().map(c -> c - '0').sum() % 9;
	}
	
	public int solution3(String number) {
		int sum = 0;
		
		// 문자 코드값 사용 : '0' = 48, '7' = 55, '7' - '0' = 7
		for (int i = 0; i < number.length(); i++) {
			sum += number.charAt(i) - '0';
		}
		
		return sum % 9;
	}	

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution2("78720646226947352489");

		System.out.println(result);
	}
}