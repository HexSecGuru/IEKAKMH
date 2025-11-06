import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] a;
        int i,j,r,c,z,s1=0, s2=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();
        a = new int[r][c];
        z = r-1;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j]=sc.nextInt();
                
            }
            System.out.println();
        }
        for(i=0;i<r;i++){
            s1=s1+a[i][i];
        }
        for(i=0;i<r;i++){
            s2=s2 + a[i][z];
            z--;
        }
        System.out.println("Sum of first diagonal is: " + s1);
        System.out.println("Sum of second diagonal is: " + s2);

        sc.close();
    }
}
