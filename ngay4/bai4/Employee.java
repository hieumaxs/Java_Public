import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private int tuoi;
    private int workingDays;
    private double salary;
    private static final int PRICE=50;
    private static Scanner scanner=new Scanner(System.in);

    public Employee(){

    }
    public Employee(String id, String name, int tuoi, int workingDays){
        this.id=id;
        this.name=name;
        this.tuoi=tuoi;
        this.workingDays=workingDays;
    }


    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double salary(){
        return this.workingDays*PRICE;
    }

    public void input(){
        System.out.println("nhap ma nhan vien: ");
        id=scanner.nextLine();
        System.out.println("nhap ten: ");
        name=scanner.nextLine();
        System.out.println("nhap tuoi: ");
        tuoi=scanner.nextInt();
        System.out.println("nhap so ngay cong: ");
        workingDays=scanner.nextInt();
    }

    public void output(){
        System.out.println("ma nhan vien: "+id);
        System.out.println("ten: "+name);
        System.out.println("tuoi: "+tuoi);
        System.out.println("so ngay cong: "+workingDays);
        System.out.println("luong: "+salary());
    }
}
