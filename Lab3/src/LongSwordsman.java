public class LongSwordsman extends Swordsman {
    public LongSwordsman(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack(Swordsman enemy) {
        super.attack(enemy);
        System.out.println("Attacked with long sword for 10 damage");
        enemy.setHp(enemy.getHp() - 10);
    }

    @Override
    public String getWeapon() {
        return "Long sword";
    }
}
