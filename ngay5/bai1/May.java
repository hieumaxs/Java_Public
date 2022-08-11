package ngay5.bai1;

import java.util.Scanner;

public class May {
	private String maMay, kieuMay, tinhTrang;

	public May(String maMay, String kieuMay, String tinhTrang) {
		this.maMay = maMay;
		this.kieuMay = kieuMay;
		this.tinhTrang = tinhTrang;
	}
	
	public May() {
		
	}
	
	public String getMaMay() {
		return maMay;
	}
	
	public void setMaMay(String maMay) {
		this.maMay=maMay;
	}

	public String getKieuMay() {
		return kieuMay;
	}

	public void setKieuMay(String kieuMay) {
		this.kieuMay = kieuMay;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma may: ");
		maMay=sc.nextLine();
		System.out.println("nhap kieu may: ");
		kieuMay=sc.nextLine();
		System.out.println("nhap tinh trang: ");
		tinhTrang=sc.nextLine();
	}
}
