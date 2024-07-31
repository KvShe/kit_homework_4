package homerorks_kit.homework_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 */
public class EmployeeDirectory {
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * Добавить метод, который ищет сотрудника по стажу (может быть список)
     */
    List<Employee> findEmployeeByExperience(int experience) {
        List<Employee> resultEmployeeList = new LinkedList<>();

        for (Employee employee : employeeList) {
            if (employee.getExperience() == experience) {
                resultEmployeeList.add(employee);
            }
        }

        return resultEmployeeList;
    }

    /**
     * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
     */
    List<Long> findNumberPhoneByName(String name) {
        List<Long> resultEmployeeList = new LinkedList<>();

        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                resultEmployeeList.add(employee.getPhoneNumber());
            }
        }

        return resultEmployeeList;
    }

    /**
     * Добавить метод, который ищет сотрудника по табельному номеру
     */
    Employee findById(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }

    /**
     * Добавить метод добавления нового сотрудника в справочник
     */
    void addNewEmployeeIn(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public String toString() {
        return employeeList.toString();
    }
}
