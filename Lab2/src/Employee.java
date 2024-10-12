public class Employee extends Person {
    private int salary;
    public Employee(String name, int age, Animal pet, int salary) {
        super(name, age, pet);
        this.salary = salary;
    }
    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getOccupation() {
        return "Employee";
    }
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}
