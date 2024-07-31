package homerorks_kit.homework_4;

public class Employee {
    private int id;
    private long phoneNumber;
    private String name;
    private int experience;

    public Employee(int id, long phoneNumber, String name, int experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee: " + "id: " + id + ", phoneNumber: " + phoneNumber + ", name: " + name + ", experience: " + experience;
    }
}
