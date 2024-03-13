package day003;

import java.util.Scanner;

public class Q03_8393 {

	// n 입력 받고 1부터 n까지의 합 구하기
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int sum = 0;
			
			for (int i = 1; i < (n + 1); i++) {
				sum += i;
			}
			
			System.out.println(sum);
		
	}
}
