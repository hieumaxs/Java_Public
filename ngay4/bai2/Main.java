import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1= new NhanVien();
        NhanVien nv2= new NhanVien();
        NhanVien nv3= new NhanVien();
        NhanVien nv4= new NhanVien();
        NhanVien nv5= new NhanVien();

        //cach 1
        Scanner scanner= new Scanner(System.in);
        System.out.println("nv1: ");
        System.out.println("nhap ten nv: ");
        nv1.setTenNV(scanner.nextLine());
        System.out.println("nhap tuoi: ");
        nv1.setTuoi(scanner.nextInt());
        System.out.println("nhap dia chi: ");
        scanner.nextLine();
        nv1.setDiaChi(scanner.nextLine());
        System.out.println("nhap bo phan: ");
        nv1.setBoPhan(scanner.nextLine());

        System.out.println("nv2: ");
        System.out.println("nhap ten nv: ");
        nv2.setTenNV(scanner.nextLine());
        System.out.println("nhap tuoi: ");
        nv2.setTuoi(scanner.nextInt());
        System.out.println("nhap dia chi: ");
        scanner.nextLine();
        nv2.setDiaChi(scanner.nextLine());
        System.out.println("nhap bo phan: ");
        nv2.setBoPhan(scanner.nextLine());

        System.out.println("nv3: ");
        System.out.println("nhap ten nv: ");
        nv3.setTenNV(scanner.nextLine());
        System.out.println("nhap tuoi: ");
        nv3.setTuoi(scanner.nextInt());
        System.out.println("nhap dia chi: ");
        scanner.nextLine();
        nv3.setDiaChi(scanner.nextLine());
        System.out.println("nhap bo phan: ");
        nv3.setBoPhan(scanner.nextLine());

        System.out.println("nv4: ");
        System.out.println("nhap ten nv: ");
        nv4.setTenNV(scanner.nextLine());
        System.out.println("nhap tuoi: ");
        nv4.setTuoi(scanner.nextInt());
        System.out.println("nhap dia chi: ");
        scanner.nextLine();
        nv4.setDiaChi(scanner.nextLine());
        System.out.println("nhap bo phan: ");
        nv4.setBoPhan(scanner.nextLine());

        System.out.println("nv5: ");
        System.out.println("nhap ten nv: ");
        nv5.setTenNV(scanner.nextLine());
        System.out.println("nhap tuoi: ");
        nv5.setTuoi(scanner.nextInt());
        System.out.println("nhap dia chi: ");
        scanner.nextLine();
        nv5.setDiaChi(scanner.nextLine());
        System.out.println("nhap bo phan: ");
        nv5.setBoPhan(scanner.nextLine());

//        System.out.println("nv1: ");
//        nv1.input();
//        System.out.println("nv2: ");
//        nv2.input();
//        System.out.println("nv3: ");
//        nv3.input();
//        System.out.println("nv4: ");
//        nv4.input();
//        System.out.println("nv5: ");
//        nv5.input();

        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Manv", "Tennv", "Tuoi", "DiaChi", "BoPhan");
        nv1.output();
        nv2.output();
        nv3.output();
        nv4.output();
        nv5.output();
    }
}
