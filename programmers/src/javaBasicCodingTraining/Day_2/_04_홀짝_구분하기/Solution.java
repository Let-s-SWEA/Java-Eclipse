// input : 100
// output : 100 is even
// input : 1
// output : 1 is odd

package javaBasicCodingTraining.Day_2._04_홀짝_구분하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		
		System.out.println(number + " is" + (number % 2 == 0 ? " even" : " odd"));
	}
}