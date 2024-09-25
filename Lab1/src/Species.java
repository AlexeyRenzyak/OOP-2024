enum Sex{
    MALE,
    FEMALE,
    NONBINARY
}

public class Species {

    static int species_count = 0;
    final String lifeform = "Carbon-based";
    private Sex speciesSex = Sex.MALE;
    private String name = "Mammal";
    private String diet = "Herbivore";
    private double age = 0.0;

    {
        species_count += 1;
        System.out.println("We have " + Integer.toString(species_count) + " species so far.");
    }
    public Species(String name, String diet, Sex speciesSex, double age) {
        this.name = name;
        this.diet = diet;
        this.speciesSex = speciesSex;
        this.age = age;
    }
    public String getLifeform() {
        return lifeform;
    }
    public String getName() {
        return name;
    }
    public String getDiet() {
        return diet;
    }
    public Sex getSex(){
        return speciesSex;
    }
    public static int getSpeciesCount() {
        return species_count;
    }

    public double getAge() {
        return age;
    }

    public void addAge(double age) {
        this.age += age;
    }
    public void addAge(int age) {
        this.age += age;
    }

}
