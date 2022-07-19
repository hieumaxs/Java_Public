import java.util.Scanner;

public class bai11 {
	public static void main(String[] args) {
		System.out.println("nhap vao ngay sinh va thang sinh: ");
		Scanner sc = new Scanner(System.in);
		int ngay, thang;
		do {
			ngay=sc.nextInt();
			thang=sc.nextInt();
			if((thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==12)&&(ngay>31||ngay<1)||(thang==2)&&(ngay<1||ngay>29)||(thang==4||thang==6||thang==9||thang==11)&&(ngay<1||ngay>30)) {
				System.out.println("khong hop le !");
				System.out.println("nhap lai ngay sinh va thang sinh");
			}
		}while((thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==12)&&(ngay>31||ngay<1)||(thang==2)&&(ngay<1||ngay>29)||(thang==4||thang==6||thang==9||thang==11)&&(ngay<1||ngay>30));
		
		if((ngay>=20&&thang==1)||(ngay<=18&&thang==2)) {
			System.out.println("cung Bao Binh");
		}else if((ngay>=19&&thang==2)||(ngay<=20&&thang==3)) {
			System.out.println("cung Song Ngu");
		}else if((ngay>=21&&thang==3)||(ngay<=20&&thang==4)) {
			System.out.println("cung Bach Duong");
		}else if((ngay>=21&&thang==4)||(ngay<=20&&thang==5)) {
			System.out.println("cung Kim Nguu");
		}else if((ngay>=21&&thang==5)||(ngay<=21&&thang==6)) {
			System.out.println("cung Song Tu");
		}else if((ngay>=22&&thang==6)||(ngay<=22&&thang==7)) {
			System.out.println("cung Cu Giai");
		}else if((ngay>=23&&thang==7)||(ngay<=22&&thang==8)) {
			System.out.println("cung Su Tu");
		}else if((ngay>=23&&thang==8)||(ngay<=22&&thang==9)) {
			System.out.println("cung Xu Nu");
		}else if((ngay>=23&&thang==9)||(ngay<=23&&thang==10)) {
			System.out.println("cung Thien Binh");
		}else if((ngay>=24&&thang==10)||(ngay<=22&&thang==11)) {
			System.out.println("cung Bo Cap");
		}else if((ngay>=23&&thang==11)||(ngay<=21&&thang==12)) {
			System.out.println("cung Nhan Ma");
		}else if((ngay>=22&&thang==12)||(ngay<=19&&thang==1)) {
			System.out.println("cung Ma Ket");
		}
	}
}
