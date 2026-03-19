// input my_string : "string"
// input k : 3
// output result : "stringstringstring" 

package javaBasicCodingTraining.Day_3_연산._03_문자열_곱하기;

class Solution{
	public String solution(String my_string, int k) {
		return my_string.repeat(k);
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		String result = sol.solution("string", 3);
		
		System.out.println(result);
	}
}