public class Test4 {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);
        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);
        double R = circuit.getResistance();
        System.out.println(R);
        circuit.applyPotentialDiff(100);
        System.out.println(circuit.getPotentialDiff());
        System.out.println(circuit.getPower());
        System.out.println(circuit.getCurrent());

    }
}

