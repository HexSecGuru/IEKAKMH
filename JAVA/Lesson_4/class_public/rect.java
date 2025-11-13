public class rect {
    private double base;
    rect(double b, double h) {
        base = b;
        height = h;

    }
    double getBase() {
        return base;
    }
    double getHeight() {
        return height;
    }
    double getArea() {
        return base * height;
    }
    void setBase(double b) {
        base = b;
    }
    void setHeight(double h) {
        height = h;
    }
}
