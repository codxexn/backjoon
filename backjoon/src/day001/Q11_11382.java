package day001;

import java.util.Scanner;

public class Q11_11382 {
	
	// 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 
	// 이제 A + B + C를 계산할 차례이다!
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        sc.close();
        
        System.out.println(a + b + c);
        
     }

}
