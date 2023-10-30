public class Employee {
    private String name;
    private int department;
    private double salary;
    private static int counter;
    private final int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }
    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Department: " + department + " Salary:$ " + salary;
    }

}
