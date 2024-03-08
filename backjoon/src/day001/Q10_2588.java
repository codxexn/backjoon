package day001;

import java.util.Scanner;

public class Q10_2588 {
	
	// 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        
        System.out.println(a * (b % 10));
        System.out.println(a * ((int)((b % 100) / 10)));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
        
     }

}
