// n : 0
// control : "wsdawsdassw"
// result : -1

package javaBasicCodingTraining.Day_6_조건문_반복문._02_수_조작하기_1;

public class Solution {
	public int solution(int n, String control) {
		for (char command : control.toCharArray()) {
			if (command == 'w') {
				n++;
			} else if (command == 's') {
				n--;
			} else if (command == 'd') {
				n += 10;
			} else if (command == 'a') {
				n -= 10;
			}
		}

		return n;
	}

	public int solution2(int n, String control) {
		for (char command : control.toCharArray()) {
			switch (command) {
			case 'w':
				n++;
				break;
			case 's':
				n--;
				break;
			case 'd':
				n += 10;
				break;
			case 'a':
				n -= 10;
				break;
			}
		}

		return n;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution2(0, "wsdawsdassw");

		System.out.println(result);
	}
}
