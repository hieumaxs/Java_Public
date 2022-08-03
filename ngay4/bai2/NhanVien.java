import java.util.Scanner;

public class NhanVien {
    private int maNV;
    private static int temp = 0;
    private String tenNV;
    private int tuoi;
    private String diaChi;
    private String boPhan;
    private static Scanner scanner= new Scanner(System.in);

    public int getMaNV() {
        maNV = ++temp;
        return this.maNV;
    }

    public String getTenNV() {

        return tenNV;
    }

    public void setTenNV(String tenNV) {

        this.tenNV = tenNV;
    }

    public int getTuoi() {

        return tuoi;
    }

    public void setTuoi(int tuoi) {

        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {

        this.diaChi = diaChi;
    }

    public String getBoPhan() {
        return this.boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }
    public void input(){
        System.out.println("nhap ten nv: ");
        tenNV=scanner.nextLine();
//        setTenNV(scanner.nextLine());
        System.out.println("nhap tuoi: ");
        tuoi=scanner.nextInt();
        System.out.println("nhap dia chi: ");
        scanner.nextLine();
        diaChi=scanner.nextLine();
        System.out.println("nhap bo phan: ");
        boPhan=scanner.nextLine();
    }
    public void output(){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", getMaNV(), tenNV, tuoi, diaChi, boPhan);
    }
}
