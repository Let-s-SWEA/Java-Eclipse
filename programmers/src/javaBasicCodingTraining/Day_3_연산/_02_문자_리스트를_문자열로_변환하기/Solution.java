// input arr : ["a","b","c"]
// output result : "abc"

package javaBasicCodingTraining.Day_3_연산._02_문자_리스트를_문자열로_변환하기;

class Solution {
	public String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();

		for (String i : arr) {
			sb.append(i);
		}
		
		String answer = sb.toString();

		return answer;
	}
	
	public String solution2(String[] arr) {
		return String.join("",  arr);
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution(new String[] {"a", "b", "c"});
		
		System.out.println(result);
	}
}