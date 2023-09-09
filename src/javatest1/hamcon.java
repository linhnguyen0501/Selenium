package javatest1;

import java.util.Scanner;

public class hamcon {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//	==BT1
		System.out.println("Nhap n");
		int n = scanner.nextInt();
		
		int sum=Tong(n);
//		System.out.println(sum);
//		Tong(n);
//		Lietkeuocso(n);
		boolean Kiemtrasonguyen=KiemtraSonguyento(n);
		
		if (Kiemtrasonguyen==true) {
			System.out.println(n + "la so nguyen to");
		}else {
			System.out.println(n + "khong la so nguyen to");
		}
		
		
	}
	public static int Tong (int n) {
		int sum=0;
		for (int i=1; i<= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		return sum;
	}
	public static void Lietkeuocso (int n) {
		for (int i=1; i<=n; i++) {
			if (n%i == 0)
				System.out.println(i);
		}
		
	}
	public static boolean KiemtraSonguyento (int n) {
		int count=0;
		for (int i=1; i<=n; i++) {
			if (n%i == 0)
				count++;
		}
		if (count ==2) {
			return true;
		}else {
			return false;
		}
		
		
	}
		
	
	

	
	
}
