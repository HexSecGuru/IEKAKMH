import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give x: "); // Changed to print for better UX
        x = sc.nextInt();
        System.out.print("Give y: "); // Changed to print for better UX
        y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("x>0 and y>0");
        } else {
            System.out.println("x<=0 or y<=0");
        }
        sc.close();
    }
}