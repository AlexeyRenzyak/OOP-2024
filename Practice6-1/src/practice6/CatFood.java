package practice6;

public class CatFood implements Edible, CatSuitable{
    public CatFood() {}
    @Override
    public String getName() {
        return "Cat Food";
    }

    @Override
    public int getNutrition() {
        return 20;
    }

    @Override
    public String taste() {
        return "Slimy";
    }
}
