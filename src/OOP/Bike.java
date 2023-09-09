package OOP;

public class Bike {

	String company;
	float price;

	public void ShowInformation() {
		System.out.println("Comapy name: " + company);
		System.out.println("Price of " +company + " bike: " + price);

	}

	public static void main(String[] args) {
		Bike martin = new Bike ();
		Bike trek = new Bike ();
		Bike scott = new Bike ();
		
		martin.company="Martin";
		martin.price=100;
		
		trek.company="Trek";
		trek.price=300;
		
		scott.company="Scott";
		scott.price=500;
		
		martin.ShowInformation();
		trek.ShowInformation();
		scott.ShowInformation();

				

	}
}
