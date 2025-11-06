import java.util.Scanner;

public class Main {
    static double area(double b, double h){
        return (b * h) / 2.0;
    }

    public static void main(String[] args) {
        double b, h, e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        b = sc.nextDouble();
        System.out.print("Enter height: ");
        h = sc.nextDouble();
        e = area(b, h);
        System.out.println("Area of triangle is: " + e);
        sc.close();
    }
}
