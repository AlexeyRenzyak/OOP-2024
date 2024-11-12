package practice6;
enum Type{
    ANIMAL, HUMAN, UNIVERSAL
}


public class Restaurant implements Comparable<Restaurant>{
    private Edible servingFood;
    private int price;
    private Type targeting;
    public Restaurant(Edible servingFood, int price, Type targeting){
        this.servingFood = servingFood;
        this.price = price;
        this.targeting = targeting;
    }
    void service(CanHavePizza eater) {
        if(eater instanceof Person){
            if (targeting == Type.ANIMAL){
                System.out.println("Only animals allowed!");
                return;
            }
        }
        if(eater instanceof Cat){
            if (targeting == Type.HUMAN){
                System.out.println("Only humans allowed!");
                return;
            }
        }
        if (eater instanceof Person) {
            System.out.println("Person must pay " + price);
            if (((Person) eater).getMoney() >= price) {
                System.out.println("Person has enough money!");
                eater.eat(servingFood);
                ((Person) eater).setMoney(((Person) eater).getMoney()-price);
            }
            else{
                System.out.println("Person has not enough money!");
            }
        }
        else{
            System.out.println("Animals don't have to pay");
            eater.eat(servingFood);
        }
    }
    @Override
    public int compareTo(Restaurant other) {
        return Integer.compare(this.price, other.price); // Compare by price
    }
}
