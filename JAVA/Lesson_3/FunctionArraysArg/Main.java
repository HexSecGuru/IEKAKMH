import java.util.Scanner;

public class Main {
    static int summary(int[] a) {
        
        int i, s = 0;
        for (i = 0; i < a.length; i++) {
            s = s + a[i];
        }
        return s;
    }
}
public static void main(String[] args) {
    int a[];
    int n, i, s;
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the size of array: ");
    n = sc.nextInt();
    a = new int[n];
    for (i = 0; i < n; i++) {
        System.out.println("Give aelements"+i);
        a[i] = sc.nextInt();
    }
    s = summary(a);
    System.out.println("The summary of array elements is: " + s);
    sc.close();

}
