// num_list : [4, 2, 6, 1, 7, 6]
// n : 2
// result : [4, 6, 7]

package javaBasicCodingTraining.Day_13_리스트._05_n개_간격의_원소들;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] num_list, int n) {
		int size = 0;
		int idx = 0;

		if (num_list.length % n == 0) {
			size = num_list.length / n;
		} else {
			size = (num_list.length / n) + 1;
		}

		int[] answer = new int[size];

		for (int i = 0; i < num_list.length; i += n) {
			answer[idx++] = num_list[i];
		}

		return answer;
	}
	
	// 개선한 버전
	public int[] solution2(int[] num_list, int n) {
		int size = (num_list.length + n - 1)/ n;
		int[] answer = new int[size];
		
		for (int i = 0; i < num_list.length; i += n) {
			answer[i / n] = num_list[i];
		}
		
		return answer;
	}


	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution(new int[] { 4, 2, 6, 1, 7, 6 }, 2);

		System.out.println(Arrays.toString(result));
	}
}