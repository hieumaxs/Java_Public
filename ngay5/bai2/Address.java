package ngay5.bai2;

import java.util.Scanner;

public class Address {
	private String id;
	private String district;
	private String province;
	private static Scanner sc= new Scanner(System.in);
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
	public void input() {
		System.out.println("id (address): ");
		id=sc.nextLine();
		System.out.println("district: ");
		district=sc.nextLine();
		System.out.println("province: ");
		province=sc.nextLine();
	}
	
	public void output() {
		System.out.println("id: "+getId());
		System.out.println("district: "+district);
		System.out.println("province: "+province);
	}
}
