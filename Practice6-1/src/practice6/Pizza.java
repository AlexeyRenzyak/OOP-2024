package practice6;

public class Pizza implements Edible, CatSuitable, PersonSuitable, Comparable<Pizza> {
    private int size = 35;
    public Pizza() {}
    public Pizza(int size) {
        this.size = size;
    }
    @Override
    public String getName() {
        return "Pizza";
    }

    @Override
    public int getNutrition() {
        return size;
    }

    @Override
    public String taste() {
        return "Salty";
    }

    @Override
    public int compareTo(Pizza other) {
        return Integer.compare(this.size, other.size); // Compare by size
    }
}
