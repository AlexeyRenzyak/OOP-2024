import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee>, Cloneable {
    private Vector<Employee> team;
    private double bonus;

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, Vector<Employee> team, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.team = team;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTeam: " + team + "\nBonus: " + bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(bonus, manager.bonus) == 0 && Objects.equals(team, manager.team) && Double.compare(getSalary(), manager.getSalary()) == 0 && Objects.equals(getHireDate(), manager.getHireDate()) && Objects.equals(getInsuranceNumber(), manager.getInsuranceNumber()) && Objects.equals(getName(), manager.getName());
    }

    @Override
    public int compareTo(Employee o) {
        if(o instanceof Manager){
            Manager manager = (Manager) o;
            if(Double.compare(getSalary(), manager.getSalary()) != 0) {
                return Double.compare(getSalary(), manager.getSalary());
            }
            else{
                return Double.compare(getBonus(), manager.getBonus());
            }
        }
        return super.compareTo(o);
    }

    @Override
    public Object clone() {
        return (Manager) super.clone();
    }

}
