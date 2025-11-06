import java.util.Scanner;

public class Main {
    static void area(double b, double h){
        double e = (b*h)/2;
        System.out.println("Area of triangle is: " + e);
    }
    public static void main(String[] args) {
        
        double b,h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        b = sc .nextDouble();
        System.out.print("Enter height: ");
        h = sc .nextDouble();
        area(b,h);




        
        sc.close();
    }
}
