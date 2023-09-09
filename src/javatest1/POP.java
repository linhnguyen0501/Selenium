package javatest1;

import java.util.Scanner;

public class POP {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Nhap chieu rong");
	int a=scanner.nextInt();
	System.out.println("Nhap chieu dai");
	int b=scanner.nextInt();
	System.out.println("Dien tich HCN");
	int c;
	c=a*b;
	System.out.println(c);
	
	System.out.println("Nhap chieu rong B");
	int a1=scanner.nextInt();
	System.out.println("Nhap chieu dai B");
	int b1=scanner.nextInt();
	System.out.println("Dien tich HCN B");
	int c1;
	c1=a1*b1;
	System.out.println(c1);
}
}
