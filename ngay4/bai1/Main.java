import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcnA= new HinhChuNhat();
        HinhChuNhat hcnB= new HinhChuNhat();

        System.out.println("cach nhap 1 (hcn A): ");
        hcnA.input();

        System.out.println("cach nhap 2 (hcn B): ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu dai hcn : ");
        hcnB.setChieuDai(scanner.nextDouble());
        System.out.println("nhap chieu rong hcn : ");
        hcnB.setChieuRong(scanner.nextDouble());


        System.out.println("dien tich hinh chu nhat A la: "+hcnA.dienTich());
        System.out.println("chu vi hinh chu nhat A la: "+hcnA.chuVi());
        System.out.println("dien tich hinh chu nhat B la: "+hcnB.dienTich());
        System.out.println("chu vi hinh chu nhat B la: "+hcnB.chuVi());
        if(hcnA.dienTich()>hcnB.dienTich()){
            System.out.println("hinh chu nhat A co dien tich lon hon");
        }else {
            System.out.println("hinh chu nhat B co dien tich lon hon");
        }
    }
}
