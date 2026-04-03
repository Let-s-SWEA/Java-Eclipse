// num_list : [2, 4, 15, 46, 38, -2, 15]
// result : 5

package javaBasicCodingTraining.Day_12_리스트._02_첫_번째로_나오는_음수;

public class Solution {
	public int solution(int[] num_list) {
		for(int idx = 0; idx < num_list.length; idx++) {
			if(num_list[idx] < 0) {
				return idx;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();

		int result = sol.solution(new int[] { 2, 4, 15, 46, 38, -2, 15 });

		System.out.println(result);
	}
}