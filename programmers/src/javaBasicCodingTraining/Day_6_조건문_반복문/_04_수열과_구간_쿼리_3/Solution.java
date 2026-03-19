// arr : [0, 1, 2, 3, 4]
// queries : [[0, 3],[1, 2],[1, 4]]	
// result : [3, 4, 1, 0, 2]

package javaBasicCodingTraining.Day_6_조건문_반복문._04_수열과_구간_쿼리_3;

public class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		for (int i = 0; i < queries.length; i++) {
				int temp;

				temp = arr[queries[i][0]];
				arr[queries[i][0]] = arr[queries[i][1]];
				arr[queries[i][1]] = temp;
		}

		return arr;
	}
	
	public int[] solution2(int[] arr, int[][] queries) {
		for (int[] query : queries) {
				int temp = arr[query[0]];
				arr[query[0]] = arr[query[1]];
				arr[query[1]] = temp;
		}
		
		int[] answer = new int[arr.length];
		for(int i = 0;i<arr.length;i++) {
			answer[i] = arr[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] result = sol.solution2(new int[] { 0, 1, 2, 3, 4 }, new int[][] { { 0, 3 }, { 1, 2 }, { 1, 4 } });

		System.out.println(result);
	}
}
