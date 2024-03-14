package day003;

import java.util.Scanner;

public class Q04_25304 {
	
	// total, 횟수 입력받고 횟수만큼 물건 금액 * 개수 더한 값 일치, 불일치 여부 출력
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	// 총액
		int n = sc.nextInt();	// 구매 물건 개수
		int result = 0;			// 총액과 비교할 모두 더한 금액
		
		for (int i = 0; i < n; i++) {	// 개수만큼 반복
			int a = sc.nextInt();		// 물건 금액
			int b = sc.nextInt();		// 해당 물건 개수
			
			result += a * b;			// 금액 * 개수를 합산
		}
		
		if (result == x) {				// 총액과 비교
			System.out.println("Yes");	// 대문자 주의(..)
		} else {
			System.out.println("No");
		}
	}
}
