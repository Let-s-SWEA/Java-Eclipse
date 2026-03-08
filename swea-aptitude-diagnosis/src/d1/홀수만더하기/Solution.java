// 홀수만 더하기
// Scanner : 입력 읽어오는 함수
// StringBuilder : 출력을 모아서 한 번에 출력하는 함수
// FileNotFoundException : 파일이 없을 때 예외처리

package d1.홀수만더하기;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Solution {

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("src/d1/홀수만더하기/input.txt"));

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int testCase = sc.nextInt();

		for (int i = 1; i <= testCase; i++) {
			int sum = 0;

			for (int j = 0; j < 10; j++) {
				int num = sc.nextInt();

				if (num % 2 == 1) {
					sum += num;
				}
			}
			sb.append("#").append(i).append(" ").append(sum).append("\n");
		}

		System.out.println(sb);
		sc.close();
	}
}
