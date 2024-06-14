public class Circle implements Figure{
    private double radius;
    private String fillColor;
    private String borderColor;
    private String name;

    public Circle(double radius, String fillColor, String borderColor, String name) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.name = name;
    }

    public double calculatePerimeter() {

        return 2 * Math.PI * radius;
    }

    public double calculateArea() {

        return Math.PI * Math.pow(radius, 2);
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
