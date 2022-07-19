import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("nhap 3 canh a, b, c: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a) {
			System.out.println("day la 3 canh cua 1 tam giac");
			if(a*a==b*b+c*c||b*b==c*c+a*a||c*c==a*a+b*b) {
				System.out.println("day la tam giac vuong");
			}else if((a*a==b*b+c*c||b*b==c*c+a*a||c*c==a*a+b*b)&&(a==b||b==c||c==a)) {
				System.out.println("day la tam giac vuong can");
			}else if((a==b||b==c||c==a)&&(a!=b||a!=c||b!=c)) {
				System.out.println("day la tam giac can");
			}else if(a==b&&b==c) {
				System.out.println("day la tam giac deu");
			}else {
				System.out.println("day la tam giac thuong");
			}
		}else {
			System.out.println("khong phai 3 canh cua 1 tam giac");
		}
	}
}
