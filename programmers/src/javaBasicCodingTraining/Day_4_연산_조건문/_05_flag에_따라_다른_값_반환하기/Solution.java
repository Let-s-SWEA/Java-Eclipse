// a : -4
// b : 7
// flag : true
// result : 3

package javaBasicCodingTraining.Day_4_연산_조건문._05_flag에_따라_다른_값_반환하기;

public class Solution {
	public int solution(int a, int b, boolean flag) {
		return flag ? a + b : a - b;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int result = sol.solution(-4, 7, false);
		
		System.out.println(result);
	}
}