package day003;

import java.util.Scanner;

public class Q01_2739 {
	
	// n 입력받아 n 구구단 출력
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			for (int i = 1; i < 10; i++) {
				System.out.println(n + " * " + i + " = " + n * i);
			}
			
	}
}
