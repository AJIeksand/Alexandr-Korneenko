public interface Figure {
    double calculatePerimeter();
    double calculateArea();
    String getFillColor();
    String getBorderColor();
    String getName();

    default void printFigureDetails() {
        System.out.println("Геометрическая фигура: " + getName());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor() + "\n");
    }
}
