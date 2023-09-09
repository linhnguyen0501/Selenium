package OOP;

import java.util.Scanner;

public class SoPhuc {
	Scanner scanner = new Scanner(System.in);

//	Thuoc tinh
	double phanThuc;
	double phanAo;

//	Constructor
	public SoPhuc() {

	}

//	Setter Getter
	public void setPhanThuc(double phanThuc) {
		this.phanThuc = phanThuc;
	}

	public void setPhanAo(double phanAo) {
		this.phanAo = phanAo;
	}

	public double getPhanThuc() {
		return this.phanThuc;
	}

	public double getPhanAo() {
		return this.phanAo;
	}

//	Actions
	public void NhapSoPhuc() {
		System.out.println("Nhap phan thuc");
		this.phanThuc = scanner.nextDouble();

		System.out.println("Nhap phan ao");
		this.phanAo = scanner.nextDouble();
	}

	public void InSoPhuc() {

		System.out.println(this.phanThuc + " + " + this.phanAo + "i");
	}
	public SoPhuc TongSoPhuc (SoPhuc sp) {
		SoPhuc ketqua = new SoPhuc ();
		ketqua.phanThuc = this.phanThuc + sp.phanThuc;
		ketqua.phanAo = this.phanAo + sp.phanAo;
		return ketqua;
	}
	public SoPhuc HieuSoPhuc (SoPhuc sp) {
		SoPhuc ketqua = new SoPhuc ();
		ketqua.phanThuc = this.phanThuc - sp.phanThuc;
		ketqua.phanAo = this.phanAo - sp.phanAo;
		return ketqua;
	}
	public SoPhuc TichSoPhuc (SoPhuc sp) {
		SoPhuc ketqua = new SoPhuc ();
		ketqua.phanThuc = this.phanThuc*sp.phanThuc -this.phanAo*sp.phanAo;
		ketqua.phanAo = this.phanThuc*sp.phanAo + this.phanAo*sp.phanThuc;
		return ketqua;
	}
	public SoPhuc ThuongSoPhuc (SoPhuc sp) {
		SoPhuc ketqua = new SoPhuc () ;
		ketqua.phanThuc = (this.phanThuc*sp.phanThuc + this.phanAo*sp.phanAo)/(sp.phanThuc*sp.phanThuc +sp.phanAo*sp.phanAo);
		ketqua.phanAo = (this.phanAo*sp.phanThuc - this.phanThuc*sp.phanAo)/(sp.phanThuc*sp.phanThuc +sp.phanAo*sp.phanAo);
		return ketqua;
	}

	public static void main(String[] args) {
		SoPhuc sp1 = new SoPhuc ();
		SoPhuc sp2 = new SoPhuc ();
		SoPhuc sp3 = new SoPhuc ();
		
		System.out.println("Nhap so phuc thu 1");
		sp1.NhapSoPhuc();
		System.out.println("Nhap so phuc thu 2");
		sp2.NhapSoPhuc();
		
		System.out.println("So phuc thu 1");
		sp1.InSoPhuc();
		System.out.println("So phuc thu 2");
		sp2.InSoPhuc();
		
		System.out.println("Tong hai so phuc");
		sp3 = sp1.TongSoPhuc(sp2);
		sp3.InSoPhuc();
		
		System.out.println("Hieu hai so phuc");
		sp3=sp1.HieuSoPhuc(sp2);
		sp3.InSoPhuc();
		
		System.out.println("Tich hai so phuc");
		sp3=sp1.TichSoPhuc(sp2);
		sp3.InSoPhuc();
		
		System.out.println("Thuong hai so phuc");
		sp3=sp1.ThuongSoPhuc(sp2);
		sp3.InSoPhuc();
	


	}
}
