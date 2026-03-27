// intStrs : ["0123456789","9876543210","9999999999999"]
// k : 50000
// s : 5
// l : 5
// result : 56789, 99999

package javaBasicCodingTraining.Day_9_문자열._01_배열_만들기_5;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();

		for (String intStr : intStrs) {
			sb.setLength(0);
			for (int i = s; i < s + l; i++) {
				sb.append(intStr.charAt(i));
			}
			if (Integer.parseInt(sb.toString()) > k) {
				list.add(Integer.parseInt(sb.toString()));
			}
		}

		return list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(new String[] { "0123456789", "9876543210", "9999999999999" }, 50000, 5, 5);

		System.out.println(Arrays.toString(result));
	}
}