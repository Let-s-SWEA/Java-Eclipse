// input : 
// output :

package javaBasicCodingTraining.Day_4._05_flag에_따라_다른_값_반환하기;

public class Solution {
	public int solution(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int result = sol.solution(0, 0);
		
		System.out.println(result);
	}
}