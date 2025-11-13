public class Main {
    public static void main(String[] args) {
        rect r = new rect(10, 20);
        System.out.println("Base: " + r.base);
        System.out.println("Height: " + r.height);
        System.out.println("Area: " + r.getArea());

        r.base = 100;
        r.height = 200;
        System.out.println("New base: " + r.base);
        System.out.println("New height: " + r.height);
        System.out.println("New area: " + r.getArea());
    }
}
