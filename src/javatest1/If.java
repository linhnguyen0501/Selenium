package javatest1;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//	===BT1===
		//	int n;
		//	System.out.println("Nhap n");
		//	n=scanner.nextInt();
		//	if (n%2==0) {
		//		System.out.println( n + " la so chan ");
		//	}else {
		//		System.out.println(n + " la so le ");
		//	}
		//	===BT2===
		//	int a,b;
		//	System.out.println("Nhap a");
		//	a=scanner.nextInt();
		//	System.out.println("Nhap b");
		//	b=scanner.nextInt();
		//	if (a >= b) {
		//		System.out.println(a + " lon hon hoac bang " + b);
		//	}else if (a<b) {
		//		System.out.println( a + "nho hon " + b);
		//	}
		//	===BT3===
		//	String TenA, TenB;
		//	System.out.println("Nhap ten A");
		//	TenA=scanner.nextLine();
		//	System.out.println("Nhap ten B");
		//	TenB=scanner.nextLine();
		//	if (TenA.equals(TenB)) {
		//		System.out.println( " 2 nguoi cung ten");
		//		
		//	}else {
		//		System.out.println( "2 nguoi khac ten");
		//	}
//		===BT4===
//		int a,b,c;
//		System.out.println("Nhap a");
//		a=scanner.nextInt();
//		System.out.println("Nhap b");
//		b=scanner.nextInt();
//		System.out.println("Nhap c");
//		c=scanner.nextInt();
//		if (a>=b) {
//			if (a>c) {
//				System.out.println(a + " lon nhat");
//			}
//			if (a<c) {
//				System.out.println(c + "lon nhat");
//			}
//		}else if (a<b) {
//			if (c<b) {
//				System.out.println( b + " lon nhat");	
//			}
//			if (c>b) {
//				System.out.println( c + "lon nhat ");
//			}
//		}
		
//		===BT5===
//		int a;
//		System.out.println("Nhap a");
//		a=scanner.nextInt();
//		if (a>=10) {
//			if (a<=100) {
//				System.out.println(a + " nam trong [10,100]");
//				
//			}
//		}else {
//			System.out.println(a + " khong nam trong [10,100]");
//		}

		
		float diem;
		System.out.println("nhap diem");
		diem=scanner.nextFloat();
		if (diem>0) {
			if (diem <5) {
				System.out.println( "Diem D");
			}
			
		}else if(diem>5) {
			if (diem<7.5) {
				System.out.println("Diem C");
			}
		}else if(diem >7.5) {
			if (diem <8.5) {
				System.out.println("Diem B");
			}
		}else if(diem>8.5) {
			if (diem<10) {
				System.out.println("Diem A");	
			}
			
		}


	}
}

 
