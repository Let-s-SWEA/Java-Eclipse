// l : 5
// r : 555
// result : [5, 50, 55, 500, 505, 550, 555]

package javaBasicCodingTraining.Day_7_반복문._02_배열_만들기_2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
	List<Integer> list = new ArrayList<>();

	void dfs(int current, int l, int r) {

		if (current > r)
			return;
		if (current >= l)
			list.add(current);

		dfs(current * 10, l, r);
		dfs(current * 10 + 5, l, r);
	}

	public int[] solution(int l, int r) {
		list.clear();
		dfs(5, l, r);

		if (list.size() == 0)
			return new int[] { -1 };

		list.sort(null);

		return list.stream().mapToInt(i -> i).toArray();
	}

	// 다른 사람 풀이 + 개선
	public int[] solution2(int l, int r) {
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < 64; i++) {
			int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
			
			if (l <= num && num <= r)				list.add(num);
		}

		return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution2(5, 555);

		System.out.println(Arrays.toString(result));
	}
}