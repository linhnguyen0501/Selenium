package javatest1;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
//		=====BT1=====
//		int number=10;
//		System.out.println("Input a number");
//		number=scanner.nextInt();
//		switch(number) {
//		case 1:
//			System.out.println("One");
//			break;
//		case 2: 
//			System.out.println("Two");
//			break;
//		case 3:
//			System.out.println("Three");
//			break;
//		case 4:
//			System.out.println("Four");
//			break;
//		case 5:
//			System.out.println("Five");
//			break;
//		case 6:
//			System.out.println("Six");
//			break;
//		case 7:
//			System.out.println("Seven");
//			break;
//		case 8:
//			System.out.println("Eight");
//			break;
//		case 9:
//			System.out.println("Nine");
//			break;
//		case 10:
//			System.out.println("Ten");
//			break;
//		}
		
		
//		====BT2===
//		int a,b;
//		System.out.println("Nhap a");
//		a=scanner.nextInt();
//		System.out.println("Nhap b");
//		b=scanner.nextInt();
//		scanner.nextLine();
//		
//		String operator="phep toan";
//		System.out.println("Nhap phep toan");
//		operator=scanner.nextLine();
//		
//		switch (operator) {
//		case "cong":
//			System.out.println( a + "+" + b + "=" + (a+b));
//			break;
//		case "tru":
//			System.out.println(a + "-" + b + "=" + (a-b));
//			break;
//		case "nhan":
//			System.out.println(a + "*" + b + "=" + (a*b));
//			break;
//		case "chia het":
//			System.out.println(a + "/" + b + "=" + (a/b));
//			break;
//		case "chia lay du":
//			System.out.println(a + "%" + b + "=" + (a%b));
//			break;
//		}
//		
		
//  =====BT3=====
		int thang;
		System.out.println("Nhap vao 1 thang");
		thang=scanner.nextInt();
		switch(thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang " + thang + " co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang "+ thang + " co 30 ngay");
			break;
		case 2: 
			System.out.println("Thang " + thang+ " co 28 hoac 29 ngay");
			break;
			
		}
		

	}
}
