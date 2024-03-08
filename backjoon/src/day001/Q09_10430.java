package day001;

import java.util.Scanner;

public class Q09_10430 {
	
	// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b %c )) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
        
     }

}
