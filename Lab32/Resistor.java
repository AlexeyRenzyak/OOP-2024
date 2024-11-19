public class Resistor extends Circuit{
    private double resistance;
    private double potentialDifference;
    public Resistor(double resistance) {
        this.resistance = resistance;
    }
    public double getResistance() {
        return resistance;
    }
    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }
    public void applyPotentialDiff(double potentialDifference) {
        this.potentialDifference = potentialDifference;
    }
}
