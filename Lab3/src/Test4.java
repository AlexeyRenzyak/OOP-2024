import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

public class Test4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("T1", 100, new Date(10), "A123");
        Employee e2 = new Employee("T2", 100, new Date(10), "A123");
        Employee e3 = new Employee("T3", 200, new Date(14), "A223");
        Manager m1 = new Manager("M1", 300, new Date(17), "A223", new Vector<Employee>(Arrays.asList(e1,e2)), 10);
        Manager m2 = new Manager("M2", 300, new Date(5), "A223", new Vector<Employee>(Arrays.asList(e3)), 10);

        Vector emps = new Vector<Employee>();
        emps.add(e1);
        emps.add(e2);
        emps.add(m1);
        emps.add(m2);
        emps.add(e3);

        Collections.sort(emps, new SortByDate());

        System.out.println(e1);
        System.out.println(e1.equals(e2));

        System.out.println(emps);

    }

}
