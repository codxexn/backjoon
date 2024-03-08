package day002;

import java.util.Scanner;

public class Q05_2884 {
	
	// 알람시계 (설정한 시간보다 45분 빠른 시간으로 출력)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m < 45) {	// 분이 45보다 적으면
			h--;		// 시에서 -1
			m += 15;	// 분에 +60 -45 라서 +15
			
			if (h < 0) { // 00시 기준으로 -1을 하면 음수가 나오므로
				h = 23;	// 시를 23으로 바꿔준다.
			}
			
		} else {		// 분이 45보다 크면
			m -= 45;	// 분에서 45만 빼주면 된다.
		}

		System.out.println(h);
		System.out.println(m);
		
	}
}
