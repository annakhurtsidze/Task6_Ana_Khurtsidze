package Task5;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;

    }


    void displayDetails(){
        System.out.println("Employee name is " + name);
        System.out.println("Employee salary  is " + salary);
    }
}
