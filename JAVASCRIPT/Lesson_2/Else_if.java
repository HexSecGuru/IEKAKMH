// import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;



public class Main {
  public static void main(String[] args) {
   int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Give n: ");
    n = sc.nextInt();
    if ( n > 0){
      System.out.println("n > 0");
    }    
    else if ( n < 0){
      System.out.println("n < 0");
    } else {
      System.out.println("n = 0");
    }

  }

}