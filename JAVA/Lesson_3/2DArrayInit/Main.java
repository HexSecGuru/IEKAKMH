public class Main {
    public static void main(String[] args) {
        int[][] a = {{10,11,1},
                     {15,20,13},
                     {19,9,1},
                     {12,1,17}};
        int i,j;
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
