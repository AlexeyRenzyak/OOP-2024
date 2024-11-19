public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat(String name, int age, Person defaultOwner) {
        super(name, age, defaultOwner);
    }
    public String getSound() {
        return "Meow";
    }
    @Override
    public Cat clone() throws CloneNotSupportedException {
        return (Cat) super.clone();
    }
}
