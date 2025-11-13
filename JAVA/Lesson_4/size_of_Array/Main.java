import java.util.Scanner;

public class Main {
    static int summary(int[] x) {
        int s = 0;
        for (int i = 0; i < x.length; i++) {
            s = s + x[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int i, n, s; // integers
        int[] a;  // array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        a = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("Give element " + i + ":");
            a[i] = sc.nextInt();
        }

        s = summary(a);
        System.out.println("Summary of array elements is: " + s);
        sc.close();
    }
}
