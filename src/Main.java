
public class Main {
    public static void main(String[] args) {

        Dog dogBublic = new Dog("Бублик");
        dogBublic.run(150);
        dogBublic.swim(10);

        Cat catPersic = new Cat("Персик");
        catPersic.run(100);
        catPersic.swim(10);

        Bowl bowl = new Bowl(100);
        Cat[] cats = {new Cat("Барсик"), new Cat("Рыжик"), new Cat("Хвостик")};
        for(Cat cat : cats) {
            cat.eat(bowl);
            System.out.println("Кот " + cat.name + " сыт " + cat.isFull());
        }

        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество собак: " + Dog.getDogCount() + "\n");

        Figure circle = new Circle(5, "Красный", "Черный", "Круг");
        circle.printFigureDetails();

        Figure rectangle = new Rectangle(5, 5, "Желтый", "Синий", "Прямоугольник");
        rectangle.printFigureDetails();

        Figure triangle = new Triangle(5, 5, 10, 10, "Зеленый", "Фиолетовый", "Треугольник");
        triangle.printFigureDetails();

    }
}