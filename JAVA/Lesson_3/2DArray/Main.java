public class Main {
    public static void main(String[] args) {
        // Declare a 2D array
        int[][] a = new int[3][4];

        // Fill the array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j; // Assigning values to the array
            }
        }

        // Print the array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(a[1][2]); // Accessing a specific element in the array
        a[1][2] = 12;

        // Print the updated array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}