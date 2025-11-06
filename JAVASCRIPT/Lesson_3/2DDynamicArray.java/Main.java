import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] a;
        int i,j,r,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        r = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        c = scanner.nextInt();
        a = new int[r][c];
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                System.out.print("Enter element for a[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
