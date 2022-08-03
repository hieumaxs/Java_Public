import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee nv= new Employee();
        Scanner scanner= new Scanner(System.in);

        System.out.println("nhap ma nhan vien: ");
        nv.setId(scanner.nextLine());
        System.out.println("nhap ho ten: ");
        nv.setName(scanner.nextLine());
        System.out.println("nhap  tuoi: ");
        nv.setTuoi(scanner.nextInt());
        System.out.println("nhap so ngay cong: ");
        nv.setWorkingDays(scanner.nextInt());

        System.out.println("id: "+nv.getId());
        System.out.println("name: "+nv.getName());
        System.out.println("tuoi: "+nv.getTuoi());
        System.out.println("so ngay cong: "+nv.getWorkingDays());
        System.out.println("luong: "+nv.salary());

        nv.input();
        nv.output();
    }
}
