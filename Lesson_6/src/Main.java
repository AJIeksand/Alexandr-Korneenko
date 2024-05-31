public class Main {
    public static void main(String[] args) {
        // Запуск кода для класса Park
        Park park = new Park(5);
        park.addAttraction("Колесо обозрения", "10:00 - 20:00", 6.50);
        park.addAttraction("Веселые горки", "10:00 - 22:00", 5.00);
        park.addAttraction("Сюрприз", "10:00 - 21:00", 5.00);
        park.addAttraction("Дом ужасов", "18:00 - 00:00", 25.0);
        park.addAttraction("Лабиринт", "12:00 - 18:00", 15.0);
        park.addAttraction("Бамперные машины", "10:00 - 22:00", 20.0);
        park.printAttractions();

        // Запуск кода для класса Employee
        Employee[] person = new Employee[5];
        person[0] = new Employee("Alex", "Alexandrovich", "Petrov", "Manager", "alpet@mail.ru", "375331111111", 50000, 25);
        person[1] = new Employee("Dmitry", "Olegovich", "Sokolov", "Security", "dmsok@mail.ru", "375442222222", 30000, 30);
        person[2] = new Employee("Oleg", "Dmitrievich", "Sidorov", "Roofer", "sidorov@mail.ru", "375337894444", 60000, 35);
        person[3] = new Employee("Ivan", "Nikolaevich", "Zaycev", "Installer", "zayac@mail.ru", "375297776655", 65000, 27);
        person[4] = new Employee("Nikolay", "Denisovich", "Lojkin", "Installer", "lojkin@mail.ru", "375445554477", 70000, 28);
        for (Employee employee : person) {
            System.out.println(employee.getValues());
        }

        Employee ivanov = new Employee("Иван", "Иванович", "Иванов", "Дворник", "ivan@mail.ru","+375291111111", 500, 65);
        System.out.println(ivanov.getValues());
    }
}

class Park {
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
        private String name, workingHours;
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

class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String jobTitle;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public Employee(String firstName, String middleName, String lastName, String jobTitle, String email, String phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getValues() {
        return "Фамилия: " + this.lastName +
                "\nИмя: " + this.firstName +
                "\nОтчество: " + this.middleName +
                "\nДолжность: " + this.jobTitle +
                "\nEmail: " + this.email +
                "\nНомер телефона: " + this.phoneNumber +
                "\nЗарплата: " + this.salary +
                "\nВозраст: " + this.age + "\n";
    }
}
