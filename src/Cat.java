class Cat extends Animal {
    public boolean isFull = false;
    private static int catCount = 0;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    public void swim(int distance) {

        System.out.println("Кот " + name + " " + "не умеет плавать");
    }

    public void eat(Bowl bowl) {
        if (bowl.getFood() >= 10) {
            bowl.decreaseFood(10);
            isFull = true;
            System.out.println("Кот " + name + " поел и сыт");
        } else {
            System.out.println("Кот " + name + " не поел, в миске мало еды");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {

        return catCount;
    }
}




