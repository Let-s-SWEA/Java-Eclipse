// (x1 ∨ x2) ∧ (x3 ∨ x4)
// ∨ : OR / ∧ : AND
// x1 : false
// x2 : true
// x3 : true
// x4 : true
// result : true

package javaBasicCodingTraining.Day_8_조건문_문자열._01_간단한_논리_연산;

public class Solution {
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		
		
		return (x1 || x2) && (x3 || x4);
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		boolean result = sol.solution(false, true, true, true);

		System.out.println(result);
	}
}