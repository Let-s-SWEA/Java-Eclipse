// 평균값 구하기

package d1.평균값구하기;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

class Solution {

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("src/d1/평균값구하기/input.txt"));

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int testCase = sc.nextInt();

		for (int i = 1; i <= testCase; i++) {
			int sum = 0;
			long avg = 0;
			
			for (int j = 0; j < 10; j++) {
				int num = sc.nextInt();
				
				sum += num;
			}
			avg = Math.round(sum / 10.0);
			
			sb.append("#").append(i).append(" ").append(avg).append("\n");
		}
		System.out.print(sb);
		sc.close();
	}
}
