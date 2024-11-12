package practice6;

public class Person extends Eater implements CanHavePizza, Comparable<Person>, CanPay{
    private String name;
    private int age;
    private int money;

    public Person(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Person(){

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat(Edible food) {
        if(food instanceof PersonSuitable) {
            setNutrients(getNutrients() + food.getNutrition());
            System.out.println("Someone is eating some " + food.taste() + " " + food.getName() + "! It restores " + food.getNutrition() + " energy.");
        }
        else {
            System.out.println("Yuck! The person will not eat this!");
        }
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    public void work(int hours){
        if(getNutrients() >= hours*5){
            setMoney(getMoney()+hours*10);
            setNutrients(getNutrients()-hours*5);
            System.out.println("The person worked, spent " + hours*5 + " energy and earned " + hours*10 + " money" );
        }
        else{
            System.out.println("The person is too tired to work");
        }
    }
}
