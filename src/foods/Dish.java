package foods;

import java.util.List;

public class Dish
{

    private String name;
    private final List<Food> listFoods;
    private int ingredientsCount;

    public Dish(String name, List<Food> listFoods)
    {
        this.name = name;
        this.listFoods = listFoods;
        this.ingredientsCount = listFoods.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getListFoods() {
        return listFoods;
    }

    public int getIngredientsCount() {
        return ingredientsCount;
    }

    public void setIngredientsCount(int ingredientsCount) {
        this.ingredientsCount = ingredientsCount;
    }

    public Food getIngredient(int index)
    {
        return listFoods.get(index);
    }

    @Override
    public String toString()
    {
        return "Dish [name=" + name + ", " + ingredientsCount + " ingredients]";
    }
}
