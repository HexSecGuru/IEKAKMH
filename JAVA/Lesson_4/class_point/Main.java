public class Main {
    public static void main(String[] args) {
        point p = new point(1,2);
        System.out.println("X: " + p.getX());
        System.out.println("Y: " + p.getY());
        p.setX(3);
        p.setY(4);
        System.out.println("New X: " + p.getX());
        System.out.println("New Y: " + p.getY());
    }
}
