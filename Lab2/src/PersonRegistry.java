import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> dataBase = new Vector<>();
    public PersonRegistry(Vector<Person> dataBase) {
        this.dataBase = dataBase;
    }
    public PersonRegistry(){}
    public Vector<Person> getDataBase() {
        return dataBase;
    }
    public void setDataBase(Vector<Person> dataBase) {
        this.dataBase = dataBase;
    }
    public void addPerson(Person person) {
        dataBase.add(person);
    }
    public void removePerson(Person person) {
        dataBase.remove(person);
    }
    public Vector<Person> getPeopleWithPets() {
        Vector<Person> people = new Vector<>();
        for (Person person : dataBase) {
            if(person.hasPet()){
                people.add(person);
            }
        }
        return people;
    }
    public Vector<Person> getPeopleWithoutPets() {
        Vector<Person> people = new Vector<>();
        for (Person person : dataBase) {
            if(person.hasPet()){
                people.add(person);
            }
        }
        return people;
    }
    public void printAll(){
        for (Person person : dataBase) {
            System.out.println(person);
        }
    }
    public void printSelected(Vector<Person> people){
        for (Person person : people) {
            System.out.println(person);
        }
    }
    public String toString(){
        String str = "";
        for (Person person : dataBase) {
            str += person.toString();
            str += "\n";
        }
        return str;
    }
}
