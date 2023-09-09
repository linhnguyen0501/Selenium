package javatest1;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//	===BT1===
//		int n;
//		System.out.println("Nhap n");
//		n = scanner.nextInt();
//
//		int i = 1;
//		while (n < 0) {
//			System.out.println("Nhap lai");
//			
//			n=scanner.nextInt();
//			
//			
//		}System.out.println("Nhap thanh cong");
//		
//		for ( i=n; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		int n;
	
		System.out.println("Nhap n");
		n=scanner.nextInt();
		int i=n;
		while(i <0) {
				System.out.println("Nhap lai n");
				n=scanner.nextInt();
				i=n;
		}System.out.println("Nhap thanh cong");
		
		
		
//		if (i % 2 == 0) {
//			System.out.println(i);
//		}i++;
		
		
		
		
		
		
	
//	====BT2===
//		int a,b;
//		System.out.println("Nhap a");
//		a=scanner.nextInt();
//		System.out.println("Nhap b");
//		b=scanner.nextInt();
		
//  				 ****** cách 1: dùng do while
//		int i=a;
//		do {
//			if (i%3 ==0 && i%5 ==0) {
//				System.out.println("So chia het cho 3 va 5 la " + i);
//			}i++;
//		}while(i<=b);
//		
		
		
//  				 ****** cách 2: dùng while và gán biến max
	
//		int max=0;
//		int min=0;
//		if (a>b) {
//			max=a;
//			min =b;
//			System.out.println( "(max) bang " + max + " and " + "(min) bang " +min);
//		}else {
//			max=b;
//			min =a;
//			System.out.println( "(max) bang " + max + " and " + "(min) bang " +min);
//		}
//		
//		int i=min;
//		
//						****** dùng while *****
//		while(i<=max) {
//			if (i % 3 ==0 && i % 5==0) {
//				System.out.println(i);	
//			}i++;
//		}
		
		
////						**** dung do-while *****
//		do {
//	
//			if (i % 3 ==0 && i %5==0) {
//				System.out.println(i);	
//			}
//			i++;
//		}while( i <=max);


		
//	=== BT3===
//		System.out.println("Nhap so nguyen n");
//		int n = scanner.nextInt();
//		int i=0;
//		int sum=0;
		
//		**** dung while *****
//		while (i<=n) {
//			if (i%2 != 0) {
//				sum = sum +i;
//			}i++;
//		}System.out.println(sum);
//		
////		**** dung do-while ******
//		do {
//			if (i % 2 != 0) {
//				sum= sum + i;
//			}
//			i++;
//		}
//		while(i <= n);
//		System.out.println(sum);
//		

		
//	==== BT4 ===
//		int a, b;
//		System.out.println(" Nhap a");
//		a=scanner.nextInt();
//		System.out.println(" Nhap b");
//		b=scanner.nextInt();
//		
//		int i;
//		i=a;
			
////				*** dung while ****
//		while(i<=b) {
//			if (i%3 ==0 ) {
//				System.out.println(i);
//			}i++;
//	    }
//			
//					**** dung do-while ***
//		do {
//			if (i%3 ==0 ) {
//				System.out.println(i);
//			}i++;
//		}while(i<=b);
		
		
		
//	==== BT5 ====
//		int n;
//		System.out.println("Nhap n");
//		n=scanner.nextInt();
//		int i=1;
//		int giaithua=1;
//		while( i <=n) {
//			giaithua = giaithua * i;
//			i++;
//		}System.out.println("giai thua bang " + giaithua);
//		
		
		
	
//  ====BT6====
//
//		int i=1;
//		int sum =0;
////		***** dung while *****
//		while (i<=10) {
//			if (i%2==0) {
//				sum=sum+i;
//				i++;
//			}
//		}
//		System.out.println("Tong cac so chan la " + sum);
		
//		      ***** dung do-while****
//		do {
//			if ( i%2 == 0) {
//				sum = sum + i;
//			}i++;
//		}
//		while (i<=10);
//		System.out.println("sum " + sum);
//		
	}
}
