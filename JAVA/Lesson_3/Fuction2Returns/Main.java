import java.util.Scanner;

public class Main {
    static boolean equal(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int x,y;
        boolean q;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give x: ");
        x = sc.nextInt();
        System.out.print("Give y: ");
        y = sc.nextInt();
        q = equal(x, y);
        System.out.println("Are x and y equal? " + q);
        sc.close();
        
    }

}
