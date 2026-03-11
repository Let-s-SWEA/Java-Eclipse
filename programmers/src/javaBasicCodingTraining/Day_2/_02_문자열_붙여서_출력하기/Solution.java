// input : apple pen
// output : applepen

package javaBasicCodingTraining.Day_2._02_문자열_붙여서_출력하기;

//import java.util.Scanner;
//
//public class Solution {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		String b = sc.next();
//		
//		System.out.println(a + b);
//	}
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(br.readLine().replaceAll(" ", ""));
	}
}