public class Test4 {
    public static void main(String[] args) {
        Circuit c1 = new Resistor(2.0);
        Circuit c2 = new Resistor(3.0);
        Circuit c3 = new Resistor(4.0);
        Circuit c4 = new Resistor(5.0);
        Circuit c5 = new Resistor(6.0);
        Circuit c6 = new Parallel(c1, c2);
        Circuit c7 = new Parallel(c6, c3);
        Circuit c8 = new Parallel(c4, c5);
        Circuit c9 = new Series(c7, c8);
        System.out.println(c9.getResistance());
        System.out.println(c9.getPower());
        System.out.println(c9.getPotentialDiff());
        c9.applyPotentialDiff(100);
        System.out.println(c9.getPower());
        System.out.println(c9.getPotentialDiff());


    }
}

