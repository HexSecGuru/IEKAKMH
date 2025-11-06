public class Main {
    static int f5() {  // Added static keyword
        int i, f = 1;
        for(i = 1; i <= 5; i++) {
            f = f * i;
        }
        return f;
    }
    
    public static void main(String[] args) {
        int f = f5();  // Now can call f5() directly
        System.out.println(f);
    }
}