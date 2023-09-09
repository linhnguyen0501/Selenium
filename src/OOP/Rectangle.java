package OOP;

public class Rectangle {
	double length;
	double width;

	public double P() {
		double p = (length + width) * 2;
		return p;
	}
	public double S() {
		double s = (length * width);
		return s;	
	}
	public Rectangle () {
		
	}
	public Rectangle (int a, int b) {
		length =a;
		width =b; 
	}
	public void setLength (double a) {
		if (length >0) {
			length =a;
		}
	}
	public void setWidth (double a) {
		if (width >0) {
			width=a;
		}
	}
	public double getLength () {
		return length;
	}
	public double getWidth (double a) {
		return width;
	}
	
	public static void main(String[] args) {
		Rectangle HCN1= new Rectangle(5,3);
		System.out.println("Length = " + HCN1.length);
		System.out.println("Width = " + HCN1.width);
		
		double p1 = HCN1.P();
		double s1 = HCN1.S();
		
		System.out.println("HCN1 co chu vi = " + p1);
		System.out.println("HCN1 co dien tich = " + s1);
	}
}
