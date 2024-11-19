public class Spacecraft implements Acceleratable{
    private String name;
    private int speed;
    private int deltaVStorage = 1000;

    public Spacecraft(String name, int speed, int deltaVStorage) {
        this.name = name;
        this.speed = speed;
        this.deltaVStorage = deltaVStorage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDeltaVStorage() {
        return deltaVStorage;
    }

    public void setDeltaVStorage(int deltaVStorage) {
        this.deltaVStorage = deltaVStorage;
    }


    @Override
    public void move(int time) {
        System.out.println(name + " moved " + time + " seconds, passed " + speed*time + " distance units.");
    }

    @Override
    public void accelerate(int deltaV) {
        if(getDeltaVStorage() >= deltaV) {
            setDeltaVStorage(getDeltaVStorage() - deltaV);
            setSpeed(getSpeed() + deltaV);
        }
        else {
            System.out.println("You can't accelerate the spacecraft. Not enough fuel.");
        }
    }
}
