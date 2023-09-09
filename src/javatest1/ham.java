package javatest1;

import java.util.Scanner;

public class ham {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap a");
		int a = sc.nextInt();
		System.out.println("Nhap b");
		int b = sc.nextInt();
		kiemtrasonguyen(a);
		
	}
	public static void kiemtrasonguyen(int number) {
		int count = 0 ;
		for ( int i=0; i<= number; i++) {
			if (number%i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(number + "la so nguyen to");
		}
		
	}
}
