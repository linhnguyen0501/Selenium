package javatest1;

import java.util.Iterator;
import java.util.Scanner;

public class Loop_for {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
//	===BT1===
//	System.out.println("Nhap vao mot so");
//	int n = scanner.nextInt();
//	for (int i=5; i<=n; i++) {
//		System.out.println(i);
//	}
	
	
//	====BT2====
//	System.out.println("Nhap so a");
//	int a=scanner.nextInt();
//	System.out.println("Nhap so b");
//	int b=scanner.nextInt();
//	
//	for ( int i=a ;i<=b; i++) {
//// Lệnh in ra màn hình cho biến i phải nằm trong {} của vòng lặp for
//		
//	}System.out.println(i);
//	

//	===BT3===
//	int sum=0;
//	for (int i=1; i<=10; i++ ) {
//		if (i%2==0) {
//			sum = sum + i;
//		}
//		
//		System.out.println("Tong cac so chan la " + sum);	
//	}
//	}System.out.println("Tong cac so chan la " + sum);	
	

	
//	===BT4===
//	int sum=0;
//	System.out.println("Nhap a");
//	int a= scanner.nextInt();
//	System.out.println("Nhap b");
//	int b= scanner.nextInt();
//	for (int i=a; i<=b; i++) {
//	
//		sum=sum +i;
//		
//	}
//	System.out.println(" Tong bang = " + sum);
	
	
	
//	===BT5===
//	int sum=0;
//	System.out.println("Nhap n");
//	int n = scanner.nextInt();
//	for (int i = 0; i <= n; i++) {
//		if (i%2 != 0) {
//			sum = sum +i;
//		}
//	}
//	System.out.println("Tong cac so le bang " + sum);
	
	
//	===BT6===
//	System.out.println("Nhap a");
//	int a=scanner.nextInt();
//	System.out.println("Nhap b");
//	int b=scanner.nextInt();
//	for (int i=a; i<=b; i++) {
//		if (i%3 ==0) {
//			System.out.println(i);
//		}
//		
//	}
	
	
//	===BT7===
			
	System.out.println("Nhap n");
	int giaithua =1;
	int n=scanner.nextInt();
	for (int i=1 ;i<=n; i++) {
		giaithua=giaithua*i;
		
	}
	System.out.println(giaithua);	
	
}
}
