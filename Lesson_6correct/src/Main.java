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



