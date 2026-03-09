// input : aBcDeFg
// output : AbCdEfG

package javaBasicCodingTraining.Day_1._04_대소문자_바꿔서_출력하기;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String a = sc.next();
		
//		char temp;
//		for(int i = 0; i < a.length(); i++) {
//			if(Character.isLowerCase(a.charAt(i))) {
//				sb.append(Character.toUpperCase(a.charAt(i)));
//			} else {
//				sb.append(Character.toLowerCase(a.charAt(i)));
//			}
//		}
		
		for(char i : a.toCharArray()) {
			if(Character.isLowerCase(i)) {
				sb.append(Character.toUpperCase(i));
			} else {
				sb.append(Character.toLowerCase(i));
			}
		}
		
		System.out.println(sb);
	}	
}