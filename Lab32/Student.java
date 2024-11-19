public class Student extends Person implements UniversityStudent {
    private double gpa;
    public Student(String name, int age, Animal pet, double gpa) {
        super(name, age, pet);
        this.gpa = gpa;
    }
    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString() {
        return super.toString() + ", GPA: " + gpa ;
    }
    public String getOccupation() {
        return "Student";
    }
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    @Override
    public String universityName() {
        return "KBTU";
    }
}
