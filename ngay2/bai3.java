import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n, sum=0;
		System.out.printf("nhap so nguyen n: ");
		n=sc.nextInt();
		if(n!=0) {
			System.out.println("tong cac uoc luon bang 0 !");
		}else {
			System.out.println("tong cac uoc = ...+(-3)+(-2)+(-1)+1+2+3+... ");
		}
		
	}
}
