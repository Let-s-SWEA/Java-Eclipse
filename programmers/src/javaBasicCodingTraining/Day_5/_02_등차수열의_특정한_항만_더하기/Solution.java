// a : 3
// d : 4
// included : [true, false, false, true, true]
// result : 37

package javaBasicCodingTraining.Day_5._02_등차수열의_특정한_항만_더하기;

import java.util.stream.IntStream;

public class Solution {
	public int solution(int a, int d, boolean[] included) {
		int temp = a;
		int sum = 0;

		for (int i = 0; i < included.length; i++) {
			if (included[i]) {
				sum += temp;
			}
			temp += d;
		}

		return sum;
	}

	// 수학 공식 활용
	public int solution2(int a, int d, boolean[] included) {
		int sum = 0;

		for (int i = 0; i < included.length; i++) {
			if (included[i]) {
				sum += a + i * d;
			}
		}

		return sum;
	}
	
	// IntStream 사용
	public int solution3(int a, int d, boolean[] included) {
		return IntStream.range(0, included.length) // 0 ~ n-1 까지의 정수 스트림 생성 (정수를 하나씩 실시간으로 가공)
				.filter(i -> included[i]) // i는 인덱스,조건에 맞는 값만 남김(included[i]가 참일 
				.map(i -> a + i * d) // 각 요소를 다른 값으로 변환(매핑)
				.sum(); // 모든 값을 더해서 int 반환
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(3, 4, new boolean[] { true, false, false, true, true });

		System.out.println(result);
	}
}