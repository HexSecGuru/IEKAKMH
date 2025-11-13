import java.util.Scanner;

public class Main {
    static int summary(int[][] x) {
        int s = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                s += x[i][j];
            }
        }
        return s;
    }

    public static void main(String[] args) { // ✅ lowercase 'main'
        int i, j, s, r, c;
        int[][] a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        r = sc.nextInt();

        System.out.println("Enter number of columns:");
        c = sc.nextInt();

        a = new int[r][c];

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print("Give element [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        s = summary(a);
        System.out.println("Summary of array elements is: " + s);
        sc.close();
    }
}
