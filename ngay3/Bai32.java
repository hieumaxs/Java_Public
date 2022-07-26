import java.lang.invoke.StringConcatException;

public class Bai32 {
	public static void main(String[] args) {
		String a1="   lam   lin3433h  ";
		System.out.println(a1);
		System.out.println("xoa dau cach thua: ");
		a1=a1.trim();
		a1=a1.replaceAll("\\s+", " ");
		System.out.println(a1);
		
		System.out.println("viet hoa chu cai dau: ");
		String a[]=a1.split("\\s");
		a1="";
		for(int i=0; i<a.length; ++i) {
			a1+=String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
			if(i<a.length-1) {
				a1+=" ";
			}
		}
		System.out.println(a1);
		
		System.out.println("xoa cac so: ");
		byte b[]= a1.getBytes();
		for(int i=0; i<b.length; ++i) {
			if(b[i]>=48&&b[i]<=57) {
				a1=a1.replaceAll("1", "");
				a1=a1.replaceAll("2", "");
				a1=a1.replaceAll("3", "");
				a1=a1.replaceAll("4", "");
				a1=a1.replaceAll("5", "");
				a1=a1.replaceAll("6", "");
				a1=a1.replaceAll("7", "");
				a1=a1.replaceAll("8", "");
				a1=a1.replaceAll("9", "");
				a1=a1.replaceAll("0", "");
				
			}
		}
		System.out.println(a1);
	}
}
