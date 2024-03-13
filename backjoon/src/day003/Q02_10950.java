package day003;

import java.util.Scanner;

public class Q02_10950 {

	// 횟수 입력받아 횟수만큼 덧셈 계산
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		
	}
}
