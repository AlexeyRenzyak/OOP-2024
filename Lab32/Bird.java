public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    public Bird(String name, int age, Person defaultOwner) {
        super(name, age, defaultOwner);
    }
    public String getSound() {
        return "Pi-pi";
    }
    @Override
    public Bird clone() throws CloneNotSupportedException {
        return (Bird) super.clone();
    }
}
