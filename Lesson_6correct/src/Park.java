public class Park {
    private Attraction[] attractions;
    private int capacity = 0;
    private int attractionCount = 0;

    public Park(int size) {
        attractions = new Attraction[size];
    }

    public void addAttraction(String name, String workingHours, double cost) {
        if (attractionCount < attractions.length) {
            attractions[capacity++] = new Attraction(name, workingHours, cost);
            attractionCount++;
        } else {
            System.out.println("Нельзя добавить новый аттракцион, парк заполнен\n");
        }
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                System.out.println(attraction);
            }
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Атракцион: " + name + "\nВремя работы: " + workingHours + "\nСтоимость: " + cost + "\n";
        }
    }
}

