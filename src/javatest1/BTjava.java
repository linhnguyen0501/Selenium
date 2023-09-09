package javatest1;

import java.util.Scanner;

public class BTjava {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a;
		a = new int[50];
		int n = 5;
//		for (int i = 0; i < n; i++) {
//			System.out.println("Nhap vao phan tu " + i);
//			a[i] = scanner.nextInt();
//		}
//		for (int i = 0; i < n; i++) {
//			System.out.print(a[i] + " ");
//		}
		NhapMang(a, n);
		System.out.println("Mang da nhap");
		
		XuatMang(a, n);
		
		System.out.println("\nVi tri so am");
		LietKeViTriGiaTriAm(a, n);
		
		System.out.println("Cac so chan");
		LietKeCacSoChan(a, n);

		System.out.println("So chan dau tien");
		int b = SoChanDauTien(a, n);
		System.out.println(b);
	}

	public static void NhapMang(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap vao phan tu " + i);
			a[i] = scanner.nextInt();
		}
	}

	public static void XuatMang(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void LietKeViTriGiaTriAm(int a[], int n) {
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static void LietKeCacSoChan(int a[], int n) {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static int SoChanDauTien(int a[], int n) {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				return a[i];
			}
		}
		return -1;
	}

}
