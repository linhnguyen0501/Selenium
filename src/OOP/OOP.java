package OOP;

public class OOP {
// Tinh dien tich va chu vi HCN
//	B1: khai bao cac thuoc tinh Properties
	double length;
	double width;
//	Khai bao ham can thuc hien - Action method
	public double P () {
		double p = (length + width)*2;
		return p;
	}
	public double S () {
		double s = length * width;
		return s;
	}
//	Constructor mac dinh - khong co tham so, default is 0
	public OOP() {
		
	}
//	Constructor khong mac dinh - co tham so 
	public OOP(int a, int b) {
		length =a;
		width =b; 
		
	}
//	Ham khoi tao - Construction method
	public static void main(String[] args) {
		OOP rec1 = new OOP();
		System.out.println("rec1.length =" + rec1.length);
		rec1.length = 5;
		rec1.width=3;
		
		double p1 = rec1.P();
		double s1 = rec1.S();
		
		System.out.println("P1 = " + p1);
		System.out.println("S1 = " + s1);
		
		OOP rec2 = new OOP(10, 8);
		double p2 = rec2.P();
		double s2 = rec2.S();
		
		System.out.println("P2 = " + p2);
		System.out.println("S2 = " + s2);
			
	}
}
