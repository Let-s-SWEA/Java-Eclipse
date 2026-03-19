// num_list : [3, 4, 5, 2, 1]
// result : 1

package javaBasicCodingTraining.Day_5._04_원소들의_곱과_합;

public class Solution {
	public int solution(int[] num_list) {
		int addSum = num_list[0];
		int mulSum = num_list[0];
		
		for (int i = 1; i < num_list.length; i++) {
			addSum += num_list[i];
			mulSum *= num_list[i];
		}
		
		if(mulSum < addSum * addSum) return 1;
		else return 0;
	}
	
	public int solution2(int[] num_list) {
		int addSum = 0;
		int mulSum = 1;
		
		for(int num : num_list) {
			addSum += num;
			mulSum *= num;
		}
		
		if(mulSum < addSum * addSum) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int result = sol.solution2(new int[] { 3, 4, 5, 2, 1 });
		
		System.out.println(result);
	}
}