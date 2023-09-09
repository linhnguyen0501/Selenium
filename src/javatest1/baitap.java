package javatest1;

import java.util.Scanner;

public class baitap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//	==== BT1 ====
//	int n;
//	System.out.println("Nhap n");
//	n=scanner.nextInt();
//	int i;
//	while (n<0) {
//		System.out.println("Nhap lai");
//		n=scanner.nextInt();
//	}System.out.println("Nhap thanh cong");
//	
//	int sum =0;
//	for (i=1 ; i <=n; i++) {
//		sum = sum + i;
//	}System.out.println( sum);

//	===== BT3 ====
//	int n;
//	System.out.println("Nhap n");
//	n=scanner.nextInt();
//	int i;
//	while (n<=0) {
//		System.out.println("Nhap lai");
//		n=scanner.nextInt();
//	}
//	System.out.println("Nhap thanh cong");
//	
//	float sum=0;
//	for (i=1; i<=n ; i++) {
////		sum = sum + 1.0f/(2*i);
//		sum = sum + (float)1/(2*i);
//	}
//	System.out.println(sum);

//	===BT4===
//		int n;
//		System.out.println("Nhap n");
//	    n=scanner.nextInt();
//	    
//	    while (n<0) {
//			System.out.println("Nhap lai");
//			n=scanner.nextInt();
//		}
//		System.out.println("Nhap thanh cong");
//	    
//		int giaithua=1;
//		int i=1;
//		do {
//			giaithua=giaithua*i;
//			i++;
//		}while (i<=n);
//		System.out.println(giaithua);
//		

//		for ( ;  ; ) {
//			giaithua=giaithua*i;
//			if (i>n) 
//			break;
//			i++;
//		}
//		System.out.println(giaithua);

//		====BT5===
//		int n;
//		System.out.println("Nhap n");
//	    n=scanner.nextInt();
//	    
//	    int i=1;
//	    while (i<=n) {
//	    	if (n %i  ==0) {
//	    		System.out.println(i);
//	    	}
//	    	i++;
//	    }

//	===== BT6 ====
//	int n;
//	System.out.println("Nhap n");
//    n=scanner.nextInt();
//    
//    while (n<0) {
//		System.out.println("Nhap lai");
//		n=scanner.nextInt();
//	}
//	System.out.println("Nhap thanh cong");
//	
//	int i=1;
//	int count=0;
//	while (i<=n) {
//		if (n%i==0) {
//			count = count +1;
//		}
//		i++;
//	}
//	System.out.println(count);
//	
//	
//	
//	if (count==2) {
//		System.out.println(n + " la so nguyen to");
//	}else {
//		System.out.println( n + " khong phai la so nguyen to");
//	}

//	===BT7===
//	System.out.println("Nhap so nguyen duong n");
//	int n=scanner.nextInt();
//
//	while (n<0) {
//			System.out.println("Vui long nhap lai");
//			n=scanner.nextInt();
//	}
//	System.out.println( "Nhap so duong thanh cong");
//	
//	int lastdigit=0;
//	int sum=0;
//	while (n !=0) {
//		 lastdigit=n % 10 ;
//		 if (lastdigit % 2 == 0) {
//			 sum = sum+ lastdigit; 
//		 }
//	 n=n/10;
//	}
//	System.out.println(sum);

//	====BT8===
//		int n;
//		System.out.println("Nhap so nguyen duong n");
//		n= scanner.nextInt();
//		
//		do {
//			if (n<0) {
//				System.out.println("Vui long nhap lai n");
//				n=scanner.nextInt();	
//			}
//		}while (n<0);
//		System.out.println(" Nhap n bang " + n + " thanh cong");
//		
//		int lastdigit;
//		int sum=0;
//		while (n != 0) {
//			lastdigit=n%10;
//			if (lastdigit % 2 != 0)
//				sum = sum + lastdigit;
//			n=n/10;
//		}
//		System.out.println("Tong cac chu so le bang " + sum);
		
		
//		====BT 9====
		
//		System.out.println("Nhap n");
//	    int n=scanner.nextInt();
//
//	    while (n<=0) {
//			System.out.println("Nhap lai");
//			n=scanner.nextInt();
//		}
//		System.out.println("Nhap n bang " + n + " thanh cong");
//		
//		if(n==1) {
//			System.out.println(n + " khong la so nguyen to");
//		}else {
//			for (int i=1; i <n ; i++) {
//				int count =0;
//				for (int a=1; a<=i; a++) {
//					if (i % a == 0) {
//						count=count+1;
//					}	
//				}
//				if (count== 2) {
//					System.out.println(i);
//				}			
//			}
//		}
		
//		====BT10===
//		System.out.println("Nhap n");
//		int n=scanner.nextInt();
//	    int reverse=0;
//	    while (n!=0) {
//	    	int digit=1;
//	    	digit = n%10;
//	    	reverse= reverse *10 + digit;
//	    	n=n/10;
//	    }System.out.println(reverse);


	}
}
