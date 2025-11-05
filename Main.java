//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int [] a = new int[10];
      int i;
      for(i=0;i<10;i++)
      {
        a[i]=i+ 1;
      }
      for(i=0;i<10;i++){
        System.out.println(a[i] + " ");
      }
      System.out.println();
      System.out.println(a[4]);
      a[4]=-5;
      for(i=0;i<10;i++){
        System.out.println(a[i] + " ");
      }
          
       
        
    }
}
