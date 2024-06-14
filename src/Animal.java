abstract class Animal {
    protected String name;
    private int maxRunDist;
    private int maxSwimDist;
    private static int animalCount = 0;

    public Animal(String name, int maxRunDist, int maxSwimDist) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        animalCount++;
    }

    public void run(int distance) {
        if(distance <= maxRunDist) {
            System.out.println(name + " пробежал " + distance + "м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + "м.");
        }
    }

    public void swim(int distance) {
        if(distance <= maxSwimDist) {
            System.out.println(name + " проплыл " + distance + "м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + "м.");
        }
    }

    public static int getAnimalCount() {

        return animalCount;
    }

}
