package javatest1;

import java.util.Scanner;

public class If_else2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap diem: ");
		Float diem = scanner.nextFloat();
//		
//		if(diem > 0) {
//			if(diem < 5) {
//				System.out.println("D");
//			}
//			else if(diem < 7.5) {
//				System.out.println("C");
//			}
//			else if(diem < 8.5) {
//				System.out.println("B");
//			}
//			else{
//				System.out.println("A");
//			}
//		}
//		else {
//			//print error
//			System.out.println("error");
//		}
		
		if (diem >8.5) {
			if(diem <=10) {
				System.out.println("A");
			}else {
				System.out.println("error");
			}
		}
		else if (diem >7.5) {
			System.out.println("B");
		}
		else if (diem >5) {
			System.out.println("C");
		}
		else if (diem >0) {
			System.out.println("D");
		}else {
			System.out.println("Error");
		}
	}
}
