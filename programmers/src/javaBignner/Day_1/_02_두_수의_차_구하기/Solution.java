// num1 : 2
// num2 : 3
// result : -1

// num1 : 100
// num2 : 2
// result : 98

package javaBignner.Day_1._02_두_수의_차_구하기;

public class Solution {
	public int solution(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(2, 3);

		System.out.println(result);
	}
}