import Practice.Time;

import java.util.Date;
import java.util.Vector;

public class Test52 {
    public static void main(String[] args) {
        Chocolate twix = new Chocolate("Twix", 5);
        Chocolate kitkat = new Chocolate("KitKat", 6);
        Chocolate mars = new Chocolate("Mars", 4);
        Chocolate[] chocolates = {twix, kitkat, mars};
        Sort.bubbleSort(chocolates);
        for (Chocolate chocolate : chocolates) {
            System.out.println(chocolate.getName());
        }

        Time t1 = new Time(0, 0, 1);
        Time t2 = new Time(1, 0, 0);
        Time t3 = new Time(0, 1, 0);
        Time[] times = {t1, t2, t3};
        Sort.insertionSort(times);
        for (Time time : times) {
            System.out.println(time.toUniversal());
        }

        Employee e1 = new Employee("T1", 300, new Date(10), "A123");
        Employee e2 = new Employee("T2", 150, new Date(10), "A133");
        Employee e3 = new Employee("T3", 200, new Date(14), "A223");
        Employee[] employees = {e1, e2, e3};
        Sort.insertionSort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

    }
}
