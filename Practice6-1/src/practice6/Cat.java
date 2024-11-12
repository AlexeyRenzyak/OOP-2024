package practice6;

public class Cat extends Eater implements CanHavePizza, Comparable<Cat>{
    private String name;
    private String color;
    public Cat(String name, String color) {
        super(0);
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void eat(Edible food) {
        if(food instanceof CatSuitable) {
            setNutrients(getNutrients()+ food.getNutrition());
            System.out.println("Cat is eating some " + food.taste() + " " + food.getName() + "! It restores " + food.getNutrition() + " energy.");
        }
        else{
            System.out.println("The cat won't eat this food!");
        }
    }
    public void play(){
        if(getNutrients()>=10) {
            System.out.println("The cat played and spent 10 energy");
            setNutrients(getNutrients()-10);
        }
        else{
            System.out.println("The cat is too tired to play");
        }

    }
    public int compareTo(Cat other) {
        return Integer.compare(this.getNutrients(), other.getNutrients()); // Compare by energy
    }
}
