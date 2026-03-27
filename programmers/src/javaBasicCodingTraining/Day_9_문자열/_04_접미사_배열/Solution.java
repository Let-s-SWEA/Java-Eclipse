// my_string : "banana"
// result : ["a", "ana", "banana", "na", "nana"]

package javaBasicCodingTraining.Day_9_문자열._04_접미사_배열;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public String[] solution(String my_string) {
		List<String> my_list = new ArrayList<>();

		for (int i = 0; i < my_string.length(); i++) {
			my_list.add(my_string.substring(i));
		}

		String[] answer = my_list.toArray(new String[0]);

		Arrays.sort(answer);

		return answer;
	}

	public String[] solution2(String my_string) {
		String[] answer = new String[my_string.length()];

		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.substring(i);
		}

		Arrays.sort(answer);

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		String[] result = sol.solution("banana");

		System.out.println(Arrays.toString(result));
	}
}