// a : 2 | 4 | 6 | 6
// b : 2 | 1 | 3 | 4
// c : 2 | 4 | 3 | 2
// d : 2 | 4 | 6 | 5
// result : 2222 | 1681 | 27 | 2

package javaBasicCodingTraining.Day_8_조건문_문자열._02_주사위_게임_3;

import java.util.Arrays;

public class Solution {
	public int solution(int a, int b, int c, int d) {
		int[] diceNum = new int[] { a, b, c, d };
		int[] count = new int[7];
		int answer = 0;
		int three = 0, firstTwo = 0, secondTwo = 0, firstOne = 0, secondOne = 0;
		int min = 7;

		for (int i = 0; i < diceNum.length; i++) {
			count[diceNum[i]]++;
		}

		for (int j = 0; j < count.length; j++) {
			if (count[j] == 4) {
				return 1111 * j;
			} else if (count[j] == 3) {
				three = j;
			} else if (count[j] == 2) {
				if (firstTwo == 0) {
					firstTwo = j;
				} else {
					secondTwo = j;
				}
			} else if (count[j] == 1) {
				min = Math.min(min, j);
				if (firstOne == 0) {
					firstOne = j;
				} else if (firstOne != 0) {
					secondOne = j;
				}
			}
		}

		if (three != 0) {
			int val = 10 * three + firstOne;
			answer = val * val;
		} else if (firstTwo != 0 && secondTwo == 0) {
			answer = firstOne * secondOne;
		} else if (firstTwo != 0 && secondTwo != 0) {
			answer = (firstTwo + secondTwo) * Math.abs(firstTwo - secondTwo);
		} else if (min != 7) {
			answer = min;
		}

		return answer;
	}

	public int solution2(int a, int b, int c, int d) {
		int[] arr = { a, b, c, d };
		Arrays.sort(arr);

		if (arr[0] == arr[3])	return 1111 * arr[0];

		if (arr[0] == arr[2] || arr[1] == arr[3]) {
			int p = arr[1];
			int q = arr[0] == arr[2] ? arr[3] : arr[0];
			int val = 10 * p + q;
			return val * val;
		}

		if (arr[0] == arr[1] && arr[2] == arr[3]) {
			return (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
		}
		
		if(arr[0] == arr[1]) return arr[2] * arr[3];
		if(arr[1] == arr[2]) return arr[0] * arr[3];
		if(arr[2] == arr[3]) return arr[0] * arr[1];

		return arr[0];
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution2(2, 5, 2, 6);

		System.out.println(result);
	}
}