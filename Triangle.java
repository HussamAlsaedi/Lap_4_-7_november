public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double area = (double) 1 / 2 * ( height * base);
        return area;
    }

    @Override
    public double calculateCircumference() {
        return (2 * height ) + base;

    }
}
