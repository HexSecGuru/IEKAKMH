package If_else;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give n: "); // Changed println to print for better input flow
        n = sc.nextInt();
        
        if (n > 0) {
            System.out.println("n > 0");
        } else {
            System.out.println("n <= 0"); // Added braces for consistency
        }
        
        sc.close(); // Added scanner close
    }
}