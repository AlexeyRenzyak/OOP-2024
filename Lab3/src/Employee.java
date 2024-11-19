import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public Employee(String name, double salary, Date hireDate) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary + "\nHire Date: " + hireDate + "\nInsurance Number: " + insuranceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(hireDate, employee.hireDate) && Objects.equals(insuranceNumber, employee.insuranceNumber) && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.getSalary(), o.getSalary());
    }
    @Override
    public Object clone() {
        try {
            return (Employee) super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}
