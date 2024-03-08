package day002;

import java.util.Scanner;

public class Q06_2525 {
	
	// 오븐시계 (현재 시간에서 주어진 분 더하기)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (b + c >= 60) {		// 현재 분에서 주어진 분을 더했을 때 60보다 크면
								// 더해준 분에 따라 120분 이상이 될 수도 있다.
								// 따라서
			a += (b + c) / 60;	// 시는 더해준 분을 60으로 나눈 몫을 더해주고
			b = (b + c) % 60;	// 분은 60으로 나눈 나머지를 대입한다.
		} else {
			b += c;				// 현재 분에 주어진 분을 더했을 때
		}						// 60 보다 작으면 그냥 더해주고 끝
		
		if (a > 23) {			// 모든 연산이 끝나고 시가 24보다 크면
			a -= 24;			// 0시로 표현해줘야 하므로 24를 빼고 대입한다.
		}
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
