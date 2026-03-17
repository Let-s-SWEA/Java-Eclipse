// input number : 60
// input n : 2
// input m : 3
// output result : 1

// input number : 55
// input n : 10
// input m : 5
// output result : 0

package javaBasicCodingTraining.Day_4._02_공배수;

public class Solution {
	public int solution(int number, int n, int m) {
		return number % n == 0 && number % m == 0 ? 1 : 0;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(55, 10, 5);

		System.out.println(result);
	}
}