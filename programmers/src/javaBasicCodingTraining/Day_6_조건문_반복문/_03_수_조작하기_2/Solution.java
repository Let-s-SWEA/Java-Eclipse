// numLog : [0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]
// result : "wsdawsdassw"

package javaBasicCodingTraining.Day_6_조건문_반복문._03_수_조작하기_2;

public class Solution {
	public String solution(int[] numLog) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < numLog.length - 1; i++) {
			if(numLog[i+1] - numLog[i] == 1) sb.append('w');
			else if(numLog[i+1] - numLog[i] == -1) sb.append('s');
			else if(numLog[i+1] - numLog[i] == 10) sb.append('d');
			else if(numLog[i+1] - numLog[i] == -10) sb.append('a');
		}

		return sb.toString();
	}
	
	public String solution2(int[] numLog) {
		StringBuilder sb = new StringBuilder(); // 그냥 String 사용하면 매번 새 문자열을 만듦.

		for (int i = 0; i < numLog.length - 1; i++) {
			int diff = numLog[i+1] - numLog[i];
			
			switch(diff) {
			case 1:
				sb.append('w');
				break;
			case -1:
				sb.append('s');
				break;
			case 10:
				sb.append('d');
				break;
			case -10:
				sb.append('a');
				break;
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String result = sol.solution2(new int[] { 0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1 });

		System.out.println(result);
	}
}
