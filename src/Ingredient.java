public class Ingredient
{
    private final String name;
    private Food food;

    public Ingredient(String name, Food food)
    {
        this.name = name;
        this.food = food;
    }

    @Override
    public String toString()
    {
        return name + " (" + food.getName() + "; Food [proteins=" + food.getProteins() + "g, calories=" + food.getCalories() + " calories, weight=" + food.getWeight() + "g])";
    }

    public String getName() {
        return name;
    }

    public Food getFood() {
        return food;
    }
}