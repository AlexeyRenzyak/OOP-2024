public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }
    public Fish(String name, int age, Person defaultOwner) {
        super(name, age, defaultOwner);
    }
    public String getSound() {
        return ".....";
    }
    @Override
    public Animal clone() throws CloneNotSupportedException {
        return (Fish) super.clone();
    }
}
