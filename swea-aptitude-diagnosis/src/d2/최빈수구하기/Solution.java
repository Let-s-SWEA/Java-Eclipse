// 최빈수 구하기

package d2.최빈수구하기;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

class Solution {
	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("src/d2/최빈수구하기/input.txt"));

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int TN = sc.nextInt();
			int[] arr = new int[101];

			for (int j = 0; j < 1000; j++) {
				int score = sc.nextInt();
				arr[score]++;
			}

			int maxIdx = 0;

			for (int j = 1; j < arr.length; j++) {
				if (arr[j] >= arr[maxIdx]) {
					maxIdx = j;
				}
			}

			sb.append("#").append(TN).append(" ").append(maxIdx).append("\n");

		}

		System.out.print(sb);
		sc.close();
	}
}