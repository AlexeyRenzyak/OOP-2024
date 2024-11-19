import java.util.Objects;

public class Ship {
    private String shipName;
    private String shipPurpose;
    private String shipOrigin;
    private int shipCrew;
    public Ship(String shipName, String shipPurpose, String shipOrigin, int shipCrew) {
        this.shipName = shipName;
        this.shipPurpose = shipPurpose;
        this.shipOrigin = shipOrigin;
        this.shipCrew = shipCrew;
    }
    public String getShipName() {
        return shipName;
    }
    public String getShipPurpose() {
        return shipPurpose;
    }
    public String getShipOrigin() {
        return shipOrigin;
    }
    public int getShipCrew() {
        return shipCrew;
    }
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
    public void setShipPurpose(String shipPurpose) {
        this.shipPurpose = shipPurpose;
    }
    public void setShipOrigin(String shipOrigin) {
        this.shipOrigin = shipOrigin;
    }
    public void setShipCrew(int shipCrew) {
        this.shipCrew = shipCrew;
    }

    public String toString() {
        return shipName + " " + shipPurpose + " " + shipOrigin + " " + shipCrew;
    }

    public boolean equals(Object x){
        if(this == x){
            return true;
        }
        if(!(x instanceof Ship)){
            return false;
        }
        Ship ship = (Ship)x;
        if(this.shipName.equals(ship.getShipName()) && this.shipPurpose.equals(ship.getShipPurpose()) && this.shipOrigin.equals(ship.getShipOrigin()) && this.shipCrew == ship.getShipCrew()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipName, shipPurpose, shipOrigin, shipCrew);
    }
}


