public class Tank implements CanAttack, Combatant {
    private String name;
    private int hull;
    private int baseDamage;
    private int volley;

    public Tank(String name, int hull, int baseDamage, int volley) {
        this.name = name;
        this.hull = hull;
        this.baseDamage = baseDamage;
        this.volley = volley;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHull() {
        return hull;
    }

    public void setHull(int hull) {
        this.hull = hull;
    }

    @Override
    public void attack(Combatant enemy) {
        enemy.sufferDamage(volley*baseDamage);
        System.out.println("Attacked with barrage for "+baseDamage*volley+" damage");
    }

    @Override
    public void sufferDamage(int damage) {
        setHull(getHull() - damage);
        if(getHull() <= 0) {
            System.out.println("Exploded!");
        }
    }

    @Override
    public int getHP() {
        return hull;
    }
}
