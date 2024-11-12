package practice6;

enum Taste{
    CHOCOLATE,VANILLA,STRAWBERRY,BUBBLEGUM,LEMON
}

public class IceCream implements Edible, PersonSuitable{
    public Taste taste = Taste.CHOCOLATE;
    public IceCream() {}
    public IceCream(Taste taste) {
        this.taste = taste;
    }
    @Override
    public String getName() {
        return "Ice Cream";
    }

    @Override
    public int getNutrition() {
        return 10;
    }

    @Override
    public String taste() {
        return taste.toString();
    }
}
