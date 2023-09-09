package OOP;

import java.util.Scanner;

public class PhanSo {
	Scanner sc = new Scanner(System.in);
// Properties
	int mauSo;
	int tuSo;
//	Constructor
	
	public PhanSo() {
		
	}
	
//	Setter
	public void setTuSo (int tuso) {
		this.tuSo=tuso;
	}
	
	public void setMauSo (int mauso) {
		this.mauSo=mauso;
	}
	
//	Getter
	public int getTuSo () {
		return this.tuSo;	
	}
	public int getMauSo () {
		return this.mauSo;
	}
	
//	Actions
//	Nhap phan so
	public void NhapPhanSo () {
		System.out.println("Nhap tu so");
		this.tuSo= sc.nextInt();
		
		System.out.println("Nhap mau so");
		this.mauSo= sc.nextInt();
	}
	
	public void InPhanSo () {
		System.out.println( this.tuSo + "/" + this.mauSo);
	}
//	Cong phan so
	public PhanSo CongPhanSo (PhanSo ps) {
		PhanSo ketqua = new PhanSo();
		 ketqua.tuSo = this.tuSo*ps.mauSo +ps.tuSo*this.mauSo;
		 ketqua.mauSo = this.mauSo * ps.mauSo;
		 
		 int ucln = UCLN (ketqua.tuSo, ketqua.mauSo);
		 ketqua.tuSo=ketqua.tuSo/ucln;
		 ketqua.tuSo=ketqua.mauSo/ucln;
		 return ketqua;
	}
//	Tru phan so
	public PhanSo TruPhanSo (PhanSo ps) {
		
		PhanSo ketqua = new PhanSo ();
		ketqua.tuSo= this.tuSo*ps.mauSo - this.mauSo*ps.tuSo;
		ketqua.mauSo= this.mauSo*ps.mauSo;
		
		int ucln =UCLN (ketqua.tuSo, ketqua.mauSo);
		ketqua.tuSo=ketqua.tuSo/ucln;
		ketqua.mauSo=ketqua.mauSo/ucln;
		return ketqua;
	}
//	Nhan phan so 
	public PhanSo NhanPhanSo (PhanSo ps) {
		PhanSo ketqua = new PhanSo ();
		ketqua.tuSo= this.tuSo*ps.tuSo ;
		ketqua.mauSo= this.mauSo*ps.mauSo;
		
		int ucln = UCLN (ketqua.tuSo, ketqua.mauSo);
		ketqua.tuSo=ketqua.tuSo/ucln;
		ketqua.mauSo=ketqua.mauSo/ucln;
		return ketqua;
	}
//	Chia phan so
	public PhanSo ChiaPhanSo (PhanSo ps) {
		PhanSo ketqua = new PhanSo ();
		ketqua.tuSo= this.tuSo*ps.mauSo ;
		ketqua.mauSo= this.mauSo*ps.tuSo;
		
		int ucln=UCLN (ketqua.tuSo, ketqua.mauSo);
		ketqua.tuSo=ketqua.tuSo/ucln;
		ketqua.mauSo=ketqua.mauSo/ucln;
		return ketqua;
	}
	public int UCLN(int a, int b) {
        int ucln = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
            }
        }
		return ucln ;
	}
	
	
//	Main
	public static void main(String[] args) {
	PhanSo ps1 = new PhanSo ();
	PhanSo ps2 = new PhanSo ();
	PhanSo ps3 = new PhanSo ();
	
	System.out.println("Nhap phan so thu 1");
	ps1.NhapPhanSo();
	System.out.println("Nhap phan so thu 2");
	ps2.NhapPhanSo();
	
	System.out.println("Phan so thu 1");
	ps1.InPhanSo();
	System.out.println("Phan so thu 2 la");
	ps2.InPhanSo();
	
//	Cong
	System.out.println("Tong 2 phan so da nhap");
	ps3= ps1.CongPhanSo(ps2);
	ps3.InPhanSo();
	
	
//	Tru
	System.out.println("Hieu 2 phan so");
	ps3=ps1.TruPhanSo(ps2);
	ps3.InPhanSo();
//	Nhan
	System.out.println("Tich 2 phan so");
	ps3=ps1.NhanPhanSo(ps2);
	ps3.InPhanSo();
//	Chia
	System.out.println("Thuong 2 phan so");
	ps3=ps1.ChiaPhanSo(ps2);
	ps3.InPhanSo();
	}
}
