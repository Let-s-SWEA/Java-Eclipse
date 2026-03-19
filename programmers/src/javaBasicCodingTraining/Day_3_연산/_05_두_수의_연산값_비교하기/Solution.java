// input a : 2
// input b : 91
// output result : 364 

package javaBasicCodingTraining.Day_3_연산._05_두_수의_연산값_비교하기;

class Solution{
	public int solution(int a, int b) {
		return Math.max(Integer.parseInt(String.valueOf(a) + "" + b), 2 * a * b);
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int result = sol.solution(91, 2);
		
		System.out.println(result);
	}
}