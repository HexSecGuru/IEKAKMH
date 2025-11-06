import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give day code\n"
                         + "1 for Monday\n"
                         + "2 for Tuesday\n"
                         + "3 for Wednesday\n"
                         + "4 for Thursday\n"
                         + "5 for Friday\n"
                         + "6 for Saturday\n"
                         + "7 for Sunday");

        d = sc.nextInt();

        switch (d) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day code!");
        }

        sc.close();
    }
}
