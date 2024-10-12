import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, Animal pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        if (pet.getDefaultOwner() == null) {
            pet.setDefaultOwner(this);
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Animal getPet() {
        return pet;
    }
    public boolean hasPet(){
        return pet != null;
    }
    public void assignPet(Animal pet){
        if (hasPet() == false){
            this.pet = pet;
            if (pet.getDefaultOwner() == null) {
                pet.setDefaultOwner(this);
            }
        }
        else {
            System.out.println("Pet is already assigned!");
        }
    }
    public Animal removePet(){
        if (hasPet() == false){
            return null;
        }
        else {
            Animal petBuffer = this.pet;
            pet = null;
            return petBuffer;
        }
    }
    public abstract String getOccupation();

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Pet: " + pet + ", Occupation: " + getOccupation();
    }
    public int hashCode(){
        return Objects.hash(name, age, pet, getOccupation());
    }

    public void leavePetWith(Person person){
        if (hasPet() == false){
            System.out.println("No pet to leave!");
        } else if (person.hasPet()) {
            System.out.println("Recipient is occupied!");

        } else {
            if( (person instanceof PhDStudent) && (getPet() instanceof Dog)){
                System.out.println("Can't leave dog with PhD!");
            }
            else{
                person.assignPet(removePet());

            }
        }
    }

    public void retrievePetFrom(Person person){
        if (hasPet() != false){
            System.out.println("Recipient is occupied!");
        } else if (!person.hasPet()) {
            System.out.println("No pet to retrieve!");
        } else if (person.getPet().getDefaultOwner() != this) {
            System.out.println("Recipient is not original owner!");
        }
        else {
            assignPet(person.removePet());
        }
    }

    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }
        if (!(x instanceof Person)) {
            return false;
        }
        Person person = (Person) x;
        if ((this.getName().equals(person.getName()) == true) && (this.getAge() == person.getAge()) && (this.getPet() == person.getPet()) && (this.getOccupation().equals(person.getOccupation())))  {
            return true;
        } else {
            return false;
        }
    }

}
