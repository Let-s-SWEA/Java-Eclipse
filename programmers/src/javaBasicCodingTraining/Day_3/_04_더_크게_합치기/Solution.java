// input a : 9
// input b : 91
// output : 991

package javaBasicCodingTraining.Day_3._04_더_크게_합치기;

class Solution {
	public int solution(int a, int b) {
		
		// 첫 번째 방법
		int answer = 0;

		if (Integer.parseInt(String.valueOf(a) + b) == Integer.parseInt(String.valueOf(b) + a)) {
			answer = Integer.parseInt(String.valueOf(a) + b);
		} else {
			answer = Integer.parseInt(String.valueOf(a) + b) > Integer.parseInt(String.valueOf(b) + a)
					? Integer.parseInt(String.valueOf(a) + b)
					: Integer.parseInt(String.valueOf(b) + a);
		}

		// 두 번째 방법
		int answer2 = Integer.parseInt(String.valueOf(a) + b) == Integer.parseInt(String.valueOf(b) + a)
				? Integer.parseInt(String.valueOf(a) + b)
				: Integer.parseInt(String.valueOf(a) + b) > Integer.parseInt(String.valueOf(b) + a)
						? Integer.parseInt(String.valueOf(a) + b)
						: Integer.parseInt(String.valueOf(b) + a);

		
		// 세 번째 방법 return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
				
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(9, 91);

		System.out.println(result);
	}
}