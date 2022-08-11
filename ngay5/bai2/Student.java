package ngay5.bai2;

import java.util.Objects;
import java.util.Scanner;

public class Student {
	private static Scanner sc=new Scanner(System.in);
	private String id;
	private String name;
	private int age;
	private Address address=new Address();
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setProvince(String province) {
		address.setProvince(province);
	}
//	public void inputId() {
//		System.out.println("id (student): ");
//		id=sc.nextLine();
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address, age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	public void input() {
		System.out.println("id (student): ");
		id=sc.nextLine();
		System.out.println("name: ");
		name=sc.nextLine();
		System.out.println("age: ");
		age=sc.nextInt();
		address.input();
		sc.nextLine();
	}
	
	public void output() {
		System.out.printf("%-15s %-15s %-15s %-20s %-20s %-20s\n",id, name, age, address.getId(), address.getDistrict(), address.getProvince());
	}
}
