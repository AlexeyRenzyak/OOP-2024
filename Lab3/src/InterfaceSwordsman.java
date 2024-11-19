public class InterfaceSwordsman implements CanAttack, Combatant {
    private String name;
    private int health;
    public InterfaceSwordsman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void attack(Combatant enemy) {
        enemy.sufferDamage(10);
        System.out.println("Attacked with sword for 10 damage");
    }

    @Override
    public void sufferDamage(int damage) {
        setHealth(getHealth() - damage);
        if(getHealth() <= 0) {
            System.out.println("Died!");
        }
    }

    @Override
    public int getHP() {
        return health;
    }
}
