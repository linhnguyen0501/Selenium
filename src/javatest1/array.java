package javatest1;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	int []a;
	a = new int [10];
	
	for ( int i=0; i< a.length; i++ ) {
		System.out.println("Nhap vao mang");
		a[i]= scanner.nextInt();
	}
	int max = Max(a);
	}
//	int sum = 0;
//	sum =a[0] + a[a.length-1];
//	System.out.println(sum);

//	BT1
//		int[] b;
//		b = new int[10];
//
//		for (int i = 0; i < b.length; i++) {
//			System.out.println("Nhap mang phan tu: " + i);
//			b[i] = scanner.nextInt();
//		}
//
//		int max = b[0];
//		for (int i = 0; i < b.length; i++) {
//			if (max <= b[i]) {
//				max = b[i];
//			}
//		}
//		System.out.println("Mang da nhap la ");
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + " ");
//		}
//		System.out.println("max number" + max);
//	}
	
	public static int Max (int[]a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max <= a[i]) {
				max = a[i];
			}
		}
		System.out.println("max number" + max);
		return max;
	}
//		Them-mot-phan-tu-vao-mang
	
	
	
}
