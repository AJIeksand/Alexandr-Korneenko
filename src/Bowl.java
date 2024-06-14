public class Bowl {
    private int food;

    public Bowl(int food) {

        this.food = food;
    }

    public int getFood() {

        return food;
    }

    public void decreaseFood(int portion) {
        if (food - portion >= 0) {
            food -= portion;
        }
    }

    public void addFood(int portion) {

        food += portion;
    }
}

