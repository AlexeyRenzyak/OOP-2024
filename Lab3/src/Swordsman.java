public abstract class Swordsman {
    private String name;
    private int hp;
    Swordsman(String name, int hp) {
        this.name = name;
        this.hp = 100;
    }
    public void attack(Swordsman enemy) {
        System.out.println("Swordsman " + name + " attacked!");
    }
    public abstract String getWeapon();
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}
