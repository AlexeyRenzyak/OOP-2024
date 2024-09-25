package Practice;

public class Main {
    public static void main(String[] args) {
        //1
        Student s1 = new Student("TEST", 111);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getYear());
        s1.incrementYear();
        s1.getYear();
        //2
        /*StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());*/
        //3
        /*Time t1 = new Time(23, 56, 26);
        System.out.println(t1.toStandard());
        System.out.println(t1.toUniversal());
        Time t2 = new Time(1, 4, 34);
        t1.addTime(t2);
        System.out.println(t1.toStandard());
        System.out.println(t1.toUniversal());*/
    }
}
