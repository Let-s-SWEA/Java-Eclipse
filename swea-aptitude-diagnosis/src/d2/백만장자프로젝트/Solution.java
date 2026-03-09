// 백만 장자 프로젝트

package d2.백만장자프로젝트;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

class Solution {

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("src/d2/백만장자프로젝트/input.txt"));

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int testCase = sc.nextInt();

		for (int i = 1; i <= testCase; i++) {
			int day = sc.nextInt();
			long[] costs = new long[day];

			for (int j = 0; j < day; j++) {
				costs[j] = sc.nextLong();
			}

			long current = costs[day - 1];
			long max = 0;

			for (int k = day - 1; k >= 0; k--) {
				if (current < costs[k]) {
					current = costs[k];
				} else {
					max += current - costs[k];
				}
			}
			sb.append("#").append(i).append(" ").append(max).append("\n");
		}
		System.out.println(sb);
		sc.close();
	}
}
