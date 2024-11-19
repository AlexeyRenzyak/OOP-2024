public abstract class Animal implements Comparable<Animal>, Cloneable, SoundProducer {
    private String name;
    private int age;
    private Person defaultOwner;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(String name, int age, Person defaultOwner) {
        this.name = name;
        this.age = age;
        this.defaultOwner = defaultOwner;
    }
    public Person getDefaultOwner() {
        return defaultOwner;
    }
    public void setDefaultOwner(Person defaultOwner) {
        this.defaultOwner = defaultOwner;
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
    public abstract String getSound();

    public String toString() {
        return name + " " + age + " " + getSound();
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }
}
