package javatest1;

import java.util.Scanner;

public class Operator {
public static void main(String[] args) {
	String Ten;
	int Tuoi;

	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Nhap ten");
	Ten=scanner.nextLine();
	System.out.println("Nhap tuoi");
	Tuoi= scanner.nextInt();
	

	int c= Tuoi +15;
	System.out.println( "After 15 years, age of " + Ten + " will be " + c);

//	//==2
//	int a,b,c;
	
	//	Scanner scanner=new Scanner(System.in);
	//	System.out.println("Nhap a");
	//	a=scanner.nextInt();
	//	System.out.println("Nhap b");
	//	b=scanner.nextInt();
//	 
//	c=a;
//	a=b;
//	b=c;
//	System.out.println("a = " + a);
//	System.out.println("b = " + b);


}
}
