
public  class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double calculateArea(){
        return  width * height;

    }

    @Override
    public double calculateCircumference() {

        double Area = calculateArea();
        double Circumference = 2 * (width * height);;
        return 2 * (width + height) ;
    }
}