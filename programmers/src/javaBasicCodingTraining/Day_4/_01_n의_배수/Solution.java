// input num :98 
// output n :  2

package javaBasicCodingTraining.Day_4._01_n의_배수;

public class Solution {
	public int solution(int num, int n) {
		return num % n == 0 ? 1 : 0;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(34, 3);

		System.out.println(result);
	}
}