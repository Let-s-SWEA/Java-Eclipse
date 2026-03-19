// a : 2
// b : 6
// c : 1
// result : 9

// a : 5
// b : 3
// c : 3
// result : 473

// a : 4
// b : 4
// c : 4
// result : 110592

package javaBasicCodingTraining.Day_5_조건문._03_주사위_게임_2;

public class Solution {
	// 내가 푼
	public int solution(int a, int b, int c) {
		int add = a + b + c;
		int squ = a * a + b * b + c * c;
		int cub = a * a * a + b * b * b + c * c * c;

		if (a == b && b == c)
			return add * squ * cub;
		if (a == b || b == c || c == a)
			return add * squ;
		return add;
	}

	// 다른 사람이 푼거
	private int pow(int x, int y) {
		if (y == 0) return 1;
		return x * pow(x, y - 1);
	}

	public int solution2(int a, int b, int c) {
		int answer = 1;
		int count = 1;
		
		if(a == b || b == c || c == a) count ++;
		if(a == b && b == c) count++;
		
		for(int i = 1; i <= count; i ++) {
			answer *= (pow(a, i) + pow(b, i) + pow(c ,i));
		}
		
		return answer;
	}
	
	// 개선!
	public int solution3(int a, int b, int c) {
		int answer = 1;
		int count = 1;
		
		if(a == b || b == c || c == a) count ++;
		if(a == b && b == c) count++;
		
		int pa = 1;
		int pb = 1;
		int pc = 1;
		
		for (int i = 1; i <= count; i++) {
			pa *= a;
			pb *= b;
			pc *= c;
			answer *= (pa + pb + pc);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(4, 4, 4);

		System.out.println(result);
	}
}