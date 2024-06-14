public class Rectangle implements Figure{
    private double a;
    private double b;
    private String fillColor;
    private String borderColor;
    private String name;

    public Rectangle(double a, double b, String fillColor, String borderColor, String name) {
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.name = name;
    }

    public double calculatePerimeter() {

        return 2 * (a + b);
    }

    public double calculateArea() {

        return a * b;
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
