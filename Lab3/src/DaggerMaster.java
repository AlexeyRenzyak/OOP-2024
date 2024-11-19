public class DaggerMaster extends Swordsman {
    public DaggerMaster(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack(Swordsman enemy) {
        super.attack(enemy);
        System.out.println("Attacked with dagger for 5 damage");
        enemy.setHp(enemy.getHp() - 5);
    }

    @Override
    public String getWeapon() {
        return "Dagger";
    }
}
