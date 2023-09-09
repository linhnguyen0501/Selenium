package javatest1;

import java.util.Scanner;

public class switch1 {


public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	

	int a,b;
	System.out.println("Nhap a");
	a=scanner.nextInt();
	System.out.println("Nhap b");
	b=scanner.nextInt();
	
//	scanner.nextLine();
	String operator= "phep toan";
	String d;
	System.out.println("Nhap phep toan");
	operator=scanner.nextLine();
	System.out.println("ghi phep toan");
	d=scanner.nextLine();
	
	
	switch(d) {
	case "cong":
		System.out.println(" a + b = " );
		break;
	case "tru":
		System.out.println("a -b = ");
		break;
	case "nhan":
		System.out.println("a*b = ");
		break;
	case "chia het":
		System.out.println("a /b = ");
		break;
	case "chia lay du":
		System.out.println("a % b =");
		break;
	
	}
	
	
}
}
