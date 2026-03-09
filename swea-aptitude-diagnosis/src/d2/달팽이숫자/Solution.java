// 달팽이 숫자

package d2.달팽이숫자;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

class Solution {

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("src/d2/달팽이숫자/input.txt"));

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int T = sc.nextInt();
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };

		for (int i = 1; i <= T; i++) {
			int testCase = sc.nextInt();
			int r = 0; // row
			int c = 0; // column
			int dir = 0; // current direction
			int[][] snail = new int[testCase][testCase];

			sb.append("#").append(i).append("\n");

			for (int j = 1; j <= testCase * testCase; j++) {
				snail[r][c] = j;

				int nr = r + dr[dir];
				int nc = c + dc[dir];

				if (nr < 0 || nr >= testCase || nc < 0 || nc >= testCase || snail[nr][nc] != 0) {
					dir = (dir + 1) % 4;
				}

				r += dr[dir];
				c += dc[dir];
			}

			for (int k = 0; k < testCase; k++) {
				for (int l = 0; l < testCase; l++) {
					sb.append(snail[k][l]).append(" ");
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
		sc.close();
	}
}