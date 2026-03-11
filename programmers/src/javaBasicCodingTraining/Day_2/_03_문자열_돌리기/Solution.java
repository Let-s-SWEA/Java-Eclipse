// input : abcde
// output : 
//	a
//	b
//	c
//	d
//	e

package javaBasicCodingTraining.Day_2._03_문자열_돌리기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class Solution {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//
//		String[] s = br.readLine().split("");
//		
//
//		for (int i = 0; i < s.length; i++) {
//			sb.append(s[i]).append("\n");
//		}
//		System.out.println(sb);
//	}
//}


// 위의 방법처럼 문자열 배이 아닌
// 아래 방법처럼 문자 배열로
// 코드를 실행했을때 메모리 낭비가 없다.
public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (char i : br.readLine().toCharArray()) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}