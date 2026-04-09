
package p2475_검증수;

import java.util.Scanner;
//import java.io.FileNotFoundException;
//import java.io.FileInputStream;
//
//class Main {
//	public static void main(String[] args) throws FileNotFoundException {
//		System.setIn(new FileInputStream("src/p2475_검증수/input.txt"));
//
//		Scanner sc = new Scanner(System.in);
//
//		int temp = 0;
//
//		for (int i = 0; i < 5; i++) {
//			int num = sc.nextInt();
//
//			temp += (num * num);
//		}
//
//		System.out.print(temp % 10);
//		sc.close();
//	}
//}

// 제출용

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int temp = 0;

		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();

			temp += (num * num);
		}

		System.out.print(temp % 10);
		sc.close();
	}
}