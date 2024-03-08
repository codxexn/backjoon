package day002;

import java.util.Scanner;

public class Q07_2480 {
	
	// 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// a = b = c
		if (a == b && a ==c) {
			System.out.println(10000 + a * 1000);
			
		// 셋 다 다른 경우, 최대값을 찾아야 한다.
		} else if (a != b && a !=c && b != c) {
			
				// 최대값 담아줄 객체 선언
				int max;
				
				if (a < b) {
					// a < b < c
					if (b < c) {
						max = c;
					// a < c < b
					} else {
						max = b;
					}
				} else {
					// b < a < c
					if (a < c) {
						max = c;
					// b < c < a
					} else {
						max = a;
					}
				}	
			System.out.println(max * 100);	
		
		// 두 개의 눈이 같을 때
		} else {
			if (a == b && a != c) {
				System.out.println(1000 + a * 100);
			} else if (a == c && a != b) {
				System.out.println(1000 + a * 100);
			} else if (b == c && b != a) {
				System.out.println(1000 + b * 100);
			}

		}
		
	}
}
