package Task5;

public class Main {
    public static void main(String[] args) {
        Employee  emp = new Employee("Dato", 3);
        emp.displayDetails();

        Manager manager = new Manager("Tako", 5000, "Finance");
        manager.displayDetails();
    }
}
