// num1 : 3
// num2 : 4
// result : 12

// num1 : 27
// num2 : 19
// result : 513

package javaBignner.Day_1._03_두_수의_곱_구하기;

public class Solution {
	public int solution(int num1, int num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(3, 4);

		System.out.println(result);
	}
}