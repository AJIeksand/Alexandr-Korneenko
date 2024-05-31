public class Employee {

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

