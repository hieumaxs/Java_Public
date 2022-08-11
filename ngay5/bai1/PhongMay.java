package ngay5.bai1;

import java.util.Scanner;

public class PhongMay {
	private static Scanner sc = new Scanner(System.in);
	private String maPhong;
	private String tenPhong;
	private double dienTich;
	private QuanLy x = new QuanLy();
	private May y = new May();
	
	public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May y) {
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.dienTich = dienTich;
		this.x = x;
		this.y = y;
	}
	
	public PhongMay() {
		
	}
	
	public String getMaPhong() {
		return maPhong;
	}
	
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	
	public String getTenPhong() {
		return tenPhong;
	}
	
	public void setTenPhong(String tenPhong) {
		this.tenPhong=tenPhong;
	}
	
	public double getDienTich() {
		return dienTich;
	}
	
	public void setDienTich(double dienTich) {
		this.dienTich=dienTich;
	}

	public void input() {
		System.out.println("nhap ma phong: ");
		maPhong=sc.nextLine();
		System.out.println("nhap ten phong: ");
		tenPhong=sc.nextLine();
		System.out.println("nhap dien tich: ");
		dienTich=sc.nextDouble();
		x.input();
		y.input();
	}
	public void output() {
		System.out.println("ma phong: "+maPhong);
		System.out.println("ten phong: "+tenPhong);
		System.out.println("dien tich: "+dienTich);
		System.out.println("ma quan li: "+x.getMaQL());
		System.out.println("ho va ten: "+x.getHoTen());
		System.out.println("ma may: "+y.getMaMay());
		System.out.println("kieu may: "+y.getKieuMay());
		System.out.println("tinh trang: "+y.getTinhTrang());
	}
	
}
