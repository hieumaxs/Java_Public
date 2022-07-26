import java.util.Scanner;

public class Bai31 {
	public static void nhapMang(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap mang: ");
		for(int i=0; i<n; ++i) {
			System.out.println("a["+i+"]= ");
			a[i]=sc.nextInt();
		}
	}
	
	public static void xuatMang(int a[], int n) {
		System.out.println("xuat mang: ");
		for(int i=0; i<n; ++i) {
			System.out.println("a["+i+"]= "+a[i]);
		}
	}
	
	public static void TBC(int a[], int n) {
		int sum=0, count=0;
		for(int i=0; i<n; ++i) {
			if(a[i]%2==1&&i%2==1) {
				sum+=a[i];
				count++;
			}
		}
		if(count>0) {
			System.out.println("TBC cac so le o vi tri chan la: "+((float)sum/count));
		}else {
			System.out.println("mang khong co so le vi tri chan !");
		}
		
	}
	
	public static void indexMin(int a[], int n) {
		System.out.println("vi tri cac so nho nhat la: ");
		int min=a[0];
		for(int i=0; i<n; ++i) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		for(int i=0; i<n; ++i) {
			if(min==a[i]) {
				System.out.println("vi tri "+(i+1));
			}
		}
	}
	
	public static boolean checkSquareNumber(int m) {
		if(m<1) {
			return false;
		}
//		int i=1;
//		while(i*i<=m) {
//			if(i*i==m) {
//				return true;
//			}
//			i++;
//		}
//		return false;
		int i= (int)Math.sqrt(m);
		if(i*i==m) {
			return true;
		}
		return false;
	}
	
	public static void squareNumber(int a[], int n) {
		int count=0;
		for(int i=0; i<n; ++i) {
			if(checkSquareNumber(a[i])) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("cac so chinh phuong la: ");
			for(int i=0; i<n; ++i) {
				if(checkSquareNumber(a[i])) {
					System.out.println(a[i]);
				}
			}
		}else {
			System.out.println("mang khong co so chinh phuong !");
		}
	}
	
	public static boolean checkPrime(int m) {
		if(m<2) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(m); ++i) {
			if(m%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void soNguyenTo(int a[], int n) {
		int count=0;
		for(int i=0; i<n; ++i) {
			if(checkPrime(a[i])) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("cac so nguyen to co trong mang la: ");
			for(int i=0; i<n; ++i) {
				if(checkPrime(a[i])) {
					System.out.println(a[i]);
				}
			}
		}else {
			System.out.println("mang khong co so nguyen to !");
		}
	}
	
	public static void tangDan(int a[], int n) {
		int temp;
		for(int i=0; i<n; ++i) {
			for(int j=i+1; j<n; ++j) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("mang sau khi sap xep la: ");
		for(int i=0; i<n; ++i) {
			System.out.printf(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int n;
		System.out.println("nhap so nguyen duong n: ");
		Scanner sc = new Scanner(System.in);
		do {
			n= sc.nextInt();
			if(n<=0) {
				System.out.println("khong hop le !");
				System.out.println("nhap lai so nguyen duong n: ");
			}
		}while(n<=0);
		int a[]=new int [n];
		nhapMang(a, n);
		xuatMang(a, n);
		TBC(a, n);
		indexMin(a, n);
		squareNumber(a, n);
		soNguyenTo(a, n);
		tangDan(a, n);
	}
}