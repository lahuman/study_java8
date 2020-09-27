package lahuman.four;

public class Dish {

    private final String name;
    private final int calories;
    private final boolean vegetarian;

    public Dish(String name, int calories){
        this.name = name;
        this.calories = calories;
        vegetarian = false;
    }

    public Dish(String name, int calories, boolean vegetarian){
        this.name = name;
        this.calories = calories;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }
    public int getCalories() {
        return calories;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }
}
