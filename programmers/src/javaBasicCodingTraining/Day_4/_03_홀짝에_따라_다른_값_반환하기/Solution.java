// input n : 7
// output result : 16

// input n : 10
// output result : 220

package javaBasicCodingTraining.Day_4._03_홀짝에_따라_다른_값_반환하기;

public class Solution {
	public int solution(int n) {
		int sum = 0;

		if (n % 2 == 1) {
			for (int i = 1; i <= n; i += 2) {
				sum += i;
			}
		} else {
			for (int i = 2; i <= n; i += 2) {
				sum += (int) Math.pow(i, 2);
			}
		}

		return sum;
	}

	// 홀수의 합과 짝수 제곱합 사
	public int solution2(int n) {
		if (n % 2 == 1) {
			int k = (n + 1) / 2;
			return k * k;
		} else {
			int k = n / 2;
			return (2 * k * (k + 1) * (2 * k + 1)) / 3;
		}
	}

	public int solution3(int n) {
		int answer = 0;

		for (int i = 0; i <= n; i += 2) {
			answer += (n % 2 == 0) ? i * i : i;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution3(10);

		System.out.println(result);
	}
}