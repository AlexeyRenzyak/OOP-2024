package Practice;

public class Student {
    private String name;
    private int id;
    private int year_of_study = 1;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getYear() {
        return year_of_study;
    }
    public void incrementYear() {
        year_of_study += 1;
    }
}
