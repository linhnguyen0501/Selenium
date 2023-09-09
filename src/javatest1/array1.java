package javatest1;

import java.util.Scanner;

public class array1 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] a;
		a = new int[100];
		int n=5;
		

//		for (int i = 0; i < a.length; i++) {
//			System.out.println("Nhap vao mang");
//			a[i] = scanner.nextInt();
//		}
		
		NhapMang(a, n);
		
		int newSize = AddNewElement(a,2,99,n);
		XuatMang(a, newSize);
		DeleteOneElement (a, 3, n);
		System.out.println("Array after delete one element");
		for (int i = 0; i< n ; i++) {
			System.out.println(a[i] + " ");
		}
	
//		Sum(a);
//		Avg(a);
//		BT1
//		int max= solonnhat(a);
//		BT2
//		int sum=sum_1standlast(a);
//		BT3
//		Sochan(a);
//		BT4
//		Solenguyenduong(a);
//		BT5
//		Solonhon0vabehon10(a);
//		BT6
		
	}
	public static int AddNewElement(int a[], int position, int insertValue,int n ) {
		for (int i=n; i> position; i--) {
			a[i]= a[i-1];
			
		}
		a[position]=insertValue;
		n = n + 1;
		return n;
				
	}
	public static int DeleteOneElement (int a[], int Delposition, int n) {
		for (int i= Delposition; i<n; i++) {
			a[i]=a[i+1];
		}

		n=n-1;
		return n;
				
	}
	
	public static void NhapMang(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap vao phan tu thu: " + i);
			arr[i] = scanner.nextInt();
		}
	}
	
	public static void XuatMang(int arr[], int n) {
		for(int i=0; i<n;i++)
			System.out.println(arr[i]+ " ");
	}
	
	public static int solonnhat(int[]a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max <= a[i]) {
				max = a[i];
			}
		}
		System.out.println("max number" + max);
		return max;
	}
	public static int sum_1standlast (int[]a) {
		int sum =0;
		sum = a[0]+ a[a.length-1];
		System.out.println("Tong so dau va so cuoi la " + sum);
		return sum;
	}
	public static void Sochan (int[]a) {
		String even= " ";
		for (int i=0; i<a.length; i++) {
			if (a[i]%2==0) {
				even = even + " " +  a[i] + ",";
			}
		}
		System.out.print("So chan la : " + even);
	}
	public static void Solenguyenduong(int[]a) {
		String Oddnumber =" " ;
		for (int i=0; i<a.length; i++) {
			if (a[i]>0 && a[i]%2 != 0) {
				Oddnumber = Oddnumber + " " + a[i] + ",";
			}
		}
		System.out.println("So le nguyen duong la : "+ Oddnumber);
	}
	public static void Solonhon0vabehon10 (int[]a){
		String Number = " ";
		for (int i=0; i<a.length; i++) {
			if (a[i]>=0 && a[i]<=10 ) {
				Number = Number + " " + a[i] + ",";
			}
		}
		System.out.println("So thuoc [0;10] la : " + Number);
	}
	public static void Sum (int[]a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum= sum + a[i];
		}
		System.out.println("Tong cac phan tu bang : " + sum);
			
	}
	public static void Avg (int[]a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum= sum + a[i];
		}
		double average;
			average= sum/(a.length);
			System.out.println("Tb cong : " + average);
			

}
	}
