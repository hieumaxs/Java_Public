package ngay5.bai1;

import java.util.Scanner;

public class QuanLy {
	private String maQL;
	private String hoTen;
	
	public QuanLy(String maQL, String hoTen) {
		this.maQL=maQL;
		this.hoTen=hoTen;
	}
	
	public QuanLy() {
		
	}
	
	public String getMaQL() {
		return maQL;
	}
	
	public void setMaQL(String maQL) {
		this.maQL=maQL;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma quan li: ");
		maQL=sc.nextLine();
		System.out.println("nhap ho va ten: ");
		hoTen=sc.nextLine();
	}
	
}
