public class Triangle implements Figure{
    private double a;
    private double b;
    private double c;
    private double h;
    private String fillColor;
    private String borderColor;
    private String name;

    public Triangle(double a, double b, double c, double h, String fillColor, String borderColor, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.name = name;
    }

    public double calculatePerimeter() {

        return a + b + c;
    }

    public double calculateArea() {

        return 0.5 * b * h;
    }

    public String getFillColor() {

        return fillColor;
    }

    public String getBorderColor() {

        return borderColor;
    }

    public String getName() {

        return name;
    }
}
