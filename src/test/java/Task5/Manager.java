package Task5;

public class Manager extends Employee{
    private String department;


    public Manager(String name, int salary, String department){
        super(name, salary);
        this.department=department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department of manager is " + department);
    }
}
