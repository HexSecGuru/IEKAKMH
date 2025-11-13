public class Main {
    public static void main(String[] args) {
        rect r = new rect(10, 20);
        System.out.println("Base: " + r.getBase());
        System.out.println("Height: " + r.getHeight());
        System.out.println("Area: " + r.getArea());

        r.setBase (100);
        r.setHeight(200);
        System.out.println("New base: " + r.getBase());
        System.out.println("New height: " + r.getHeight());
        System.out.println("New area: " + r.getArea());
    }
}
