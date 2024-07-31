package homerorks_kit.homework_4;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();

        employeeDirectory.addNewEmployeeIn(new Employee(0, 88002000700L, "Jonny", 10));
        employeeDirectory.addNewEmployeeIn(new Employee(1, 88002000701L, "Arthur", 8));
        employeeDirectory.addNewEmployeeIn(new Employee(2, 88002000702L, "Sara", 5));
        employeeDirectory.addNewEmployeeIn(new Employee(3, 88002000703L, "Sofia", 5));
        employeeDirectory.addNewEmployeeIn(new Employee(4, 88002000704L, "Anna", 6));
        employeeDirectory.addNewEmployeeIn(new Employee(5, 88002000705L, "Anna", 10));

        System.out.println(employeeDirectory);
        System.out.println(employeeDirectory.findEmployeeByExperience(5));
        System.out.println(employeeDirectory.findNumberPhoneByName("Anna"));
        System.out.println(employeeDirectory.findById(0));
    }
}
