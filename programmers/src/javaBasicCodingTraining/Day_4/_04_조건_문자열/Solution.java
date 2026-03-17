// ineq : "<"
// eq : "="
// n : 20
// m : 50
// result : 1

package javaBasicCodingTraining.Day_4._04_조건_문자열;

public class Solution {
	public int solution(String ineq, String eq, int n, int m) {
		switch (ineq + eq) {
		case "<=":
			return n <= m ? 1 : 0;
		case ">=":
			return n >= m ? 1 : 0;
		case "<!":
			return n < m ? 1 : 0;
		case ">!":
			return n > m ? 1 : 0;
		default:
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(">", "=", 41, 78);

		System.out.println(result);
	}
}