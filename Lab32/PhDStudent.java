public class PhDStudent extends Person implements UniversityStudent{
    private double gpa;
    private int researches;
    public PhDStudent(String name, int age, Animal pet, double gpa, int researches) {
        super(name, age, pet);
        if(pet instanceof Dog){
            System.out.println("PhD Student can't have a dog! Fallback to petless");
            this.removePet();
        }
        this.gpa = gpa;
        this.researches = researches;
    }
    public PhDStudent(String name, int age, double gpa, int researches) {
        super(name, age);
        this.gpa = gpa;
        this.researches = researches;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public int getResearches() {
        return researches;
    }
    public void setResearches(int researches) {
        this.researches = researches;
    }

    public String toString() {
        return super.toString() + ", GPA: " + gpa + ", Researches: " + researches;
    }

    public String getOccupation() {
        return "PhD Student";
    }

    public void assignPet(Animal pet) {
        if(pet instanceof Dog){
            System.out.println("PhD Student can't have a dog!");
        }
        else {
            super.assignPet(pet);
        }
    }
    @Override
    public PhDStudent clone() throws CloneNotSupportedException {
        return (PhDStudent) super.clone();
    }

    @Override
    public String universityName() {
        return "KBTU";
    }
}
