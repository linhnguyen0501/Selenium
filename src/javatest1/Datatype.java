package javatest1;

public class Datatype {
	public static void main(String[] args) {
//		byte numberByte = 127;
//		short numberShort = 32767;
//		int numberInt = 5;
//		long numberLong = 9999;
//		float  numberFloat = 1.54f;
//		double numberDouble = 1.6677;
//		boolean booleanTrue = true; // true: 1
//		boolean booleanFalse = false; // false: 0
//		char c = 'c';
		//size
		// bit: 0-1 => 010101010111000 => chuỗi nhị phân
		// 1 byte = 8 bit
		
		
		
		// BT phép tính toán
		int a=6, b=2;
    	int P1=a+b;
    	int P2= a-b;
    	int P3=a*b;
    	int P4= a/b;
    	    	
    	System.out.println( "a + b ="+ P1 );
    	System.out.println("a - b =" + P2);
    	System.out.println( "a * b =" + P3);
    	System.out.println( "a / b =" + P4);
    	
    	
    	// BT tính diện tích HCN
    	float d=7.5f , r=3.8f;
    	System.out.println("Area =" + " 7.5 * 3.8 =" + d*r);
    	System.out.println("Chu vi = (7.5 + 3.8)*2" + (d+r)*2 );
    	
    	//BT in ra màn hình chuỗi kí tự
    	String c= "Automation Testing";
    	System.out.println("Hello "+ c);
    	
    	float m=12; 
    	int n=3;
    	m++;
    	n--;
    	float z= m + n;
    	float x=m*n;
    	float v=m/n;
    	System.out.println("m = " +m );
    	System.out.println("n = " + n);
    	System.out.println("Tổng z bằng " + z);
    	System.out.println("x = " + x);
    	System.out.println( "v = " + v);

	}
}
