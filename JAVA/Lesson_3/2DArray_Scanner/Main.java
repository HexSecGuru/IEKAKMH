
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int i,j;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 3; i++) 
        {
            for (j = 0; j < 4; j++) 
            {
                System.out.print("Enter element for a[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i < 3; i++) 
        {
            for (j = 0; j < 4; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }             
}
