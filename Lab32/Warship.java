import java.util.Objects;

public class Warship extends Ship {
    private String shipClass;

    public Warship(String shipName, String shipOrigin, int shipCrew, String shipClass) {
        super(shipName, "Military", shipOrigin, shipCrew);
        this.shipClass = shipClass;
    }

    public String getShipClass() {
        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public String toString() {
        return getShipName() + " " + getShipPurpose() + " " + getShipOrigin() + " " + getShipCrew() + " " + shipClass;
    }

    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }
        if (!(x instanceof Warship)) {
            return false;
        }
        Warship ship = (Warship) x;
        if (this.getShipName().equals(ship.getShipName()) && this.getShipPurpose().equals(ship.getShipPurpose()) && this.getShipOrigin().equals(ship.getShipOrigin()) && this.getShipCrew() == ship.getShipCrew() && this.getShipClass() == ship.getShipClass()) {
            return true;
        } else {
            return false;
        }
    }
    public int hashCode() {
        return Objects.hash(getShipName(), getShipPurpose(), getShipOrigin(), getShipCrew(), getShipClass());
    }
}
