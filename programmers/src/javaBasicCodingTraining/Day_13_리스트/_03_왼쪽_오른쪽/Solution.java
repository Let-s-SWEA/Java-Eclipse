// str_list : ["u", "u", "l", "r"]
// 

package javaBasicCodingTraining.Day_13_리스트._03_왼쪽_오른쪽;

import java.util.Arrays;

public class Solution {
	public String[] solution(String[] str_list) {
		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i] == "l") {
				return Arrays.copyOfRange(str_list, 0, i);
			} else if (str_list[i] == "r") {
				return Arrays.copyOfRange(str_list, i + 1, str_list.length);
			}
		}
		return new String[0];
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String[] result = sol.solution(new String[] { "u", "u", "l", "r" });

		System.out.println(Arrays.toString(result));
	}
}