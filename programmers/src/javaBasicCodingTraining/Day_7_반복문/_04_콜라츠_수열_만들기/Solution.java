//	n : 10
//	result : [10, 5, 16, 8, 4, 2, 1]

package javaBasicCodingTraining.Day_7_반복문._04_콜라츠_수열_만들기;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// 다른 사람 풀이
import java.util.stream.IntStream;

public class Solution {
	public int[] solution(int n) {
		List<Integer> list = new ArrayList<>();

		list.add(n);

		while (n != 1) {
			n = n % 2 == 0 ? n / 2 : 3 * n + 1;
			list.add(n);
		}

		return list.stream().mapToInt(i -> i).toArray();
	}

	// 다른 사람 풀이
	public int[] solution2(int n) {
		return IntStream.concat(IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : 3 * i + 1), IntStream.of(1))
				.toArray();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution2(10);

		System.out.println(Arrays.toString(result));
	}
}