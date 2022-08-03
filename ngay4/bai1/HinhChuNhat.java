import java.util.Scanner;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    private static Scanner scanner = new Scanner(System.in);

    //cach 1:
    public void input() {
        System.out.println("nhap chieu dai hcn : ");
        chieuDai = scanner.nextDouble();
        System.out.println("nhap chieu rong hcn : ");
        chieuRong = scanner.nextDouble();
    }

    public void output() {
        System.out.println("chieu dai hcn la: " + chieuDai);
        System.out.println("chieu rong hcn la: " + chieuRong);
    }

    //cach 2
    public double getChieuDai() {
        return this.chieuDai;
    }

    public void setChieuDai(double dai) {
        this.chieuDai = dai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double rong) {
        this.chieuRong = rong;
    }

    public double dienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public double chuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }
}
