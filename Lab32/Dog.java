public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public Dog(String name, int age, Person defaultOwner) {
        super(name, age, defaultOwner);
    }
    public String getSound() {
        return "Bark";
    }
    @Override
    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }
}
