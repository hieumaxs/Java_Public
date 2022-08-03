import java.util.Scanner;

public class PTBac2 {
    private double a;
    private double b;
    private double c;
    private static Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.println("nhap a: ");
        a=scanner.nextDouble();
        System.out.println("nhap b: ");
        b=scanner.nextDouble();
        System.out.println("nhap c: ");
        c=scanner.nextDouble();
    }
    public void output(){
        System.out.println("phuong trinh vua nhap la: "+this.a+"x^2 + "+this.b+"x + "+this.c+"= 0");
    }

    public void tinhNghiem(){
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("phuong trinh co vo so nghiem !");
                }else{
                    System.out.println("phuong tinh vo nghiem !");
                }
            }else{
                System.out.println("x=-c/b= "+-c/b);
            }
        }else{
            double denta=b*b-4*a*c;
            if(denta>0) {
                System.out.println("phuong trinh co 2 nghiem: ");
                System.out.println("x1= " + (-b + Math.sqrt(denta)) / (2 * a));
                System.out.println("x2= " + (-b - Math.sqrt(denta)) / (2 * a));
            }else if(denta == 0){
                System.out.println("phuong trinh co nghiem kep: x1=x2= "+-b/(2*a));
            }else{
                System.out.println("phuong trinh vo nghiem !");
            }
        }
    }
}
