package ngay5.bai2;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static int n;
	private static Student obj[];
	//	private Student sv = new Student();
	
	public static void nhapN() {
		System.out.println("nhap vao so nguyen duong n: ");
		do {
			n=sc.nextInt();
			if(n<=0) {
				System.out.println("yeu cau nhap n>0 !");
				System.out.println("nhap lai so nguyen duong n: ");
			}
		}while(n<=0);
	}
	
	public static void hienThi(Student obj[]) {
		for(int i=0; i<n; ++i) {
			System.out.println("nhap thong tin sinh vien "+(i+1));
			obj[i].input();
		}
		System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s\n", "id (student)", "name", "age", "id (address)", "district", "province");
		for(int i=0; i<n; ++i) {
			obj[i].output();
		}
		
	}
	public static void timId(Student obj[]) {
		String id;
		int count=0;
		System.out.println("nhap id can tim: ");
		sc.nextLine();
		id=sc.nextLine();
		for(int i=0; i<n; ++i) {
			if(obj[i].getId().equals(id)) {
				System.out.println("sinh vien can tim la: ");
				obj[i].output();
				count++;
			}
		}
		if(count==0) {
			System.out.println("khong ton tai id tren !");
		}
	}
	
	public static void sua(Student obj[]) {
		int count=0;
		for(int i=0; i<n; ++i) {
			if(obj[i].getAddress().getProvince().equals("thanh hoa")) {
				count++;
				obj[i].setProvince("hai phong");;
//				obj[i].get
			}
		}
		if(count>0) {
			System.out.println("cac sinh vien sau khi sua la: ");
			for(int i=0; i<n; ++i) {
				obj[i].output();
			}
		}else {
			System.out.println("khong co sinh vien duoc sua !");
		}
		System.out.println(obj[0].getAddress().getProvince());
	}
	
	public static void xoaSinhVien(Student obj[]) {
		String id;
		System.out.println("nhap id can xoa: ");
		id=sc.nextLine();
		int count=0;
		for(int i=0; i<n; ++i) {
			if(obj[i].getId().equals(id)) {
				for(int j=i; j<n-1; ++j) {
					obj[j]=obj[j+1];
				}
				count++;
				n=n-1;
				System.out.println("cac sinh vien sau khi xoa: ");
				for(int j=0; j<n; ++j) {
					obj[j].output();
				}
			}
		}
		if(count==0) {
			System.out.println("id can xoa khong ton tai !");
		}
	}
	
	public static void main(String[] args) {
		nhapN();
		obj= new Student[n];
		for(int i=0; i<n; ++i) {
			obj[i]= new Student();
		}
//			int temp=-1;
//			do {
//				obj[i].inputId();
//				for(int j=i-1; j>=0; j--) {
//					if(obj[i].getId()==obj[j].getId()) {
//						temp=j;
//						System.out.println("id da ton tai !");
//					}
//				}
//			}while(obj[i].getId()==obj[temp].getId());
//			
		hienThi(obj);
		timId(obj);
		sua(obj);
		xoaSinhVien(obj);
	}
}
