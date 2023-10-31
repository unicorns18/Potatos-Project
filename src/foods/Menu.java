package foods;

import java.time.LocalDateTime;
import java.util.List;

public class Menu
{
    public static final int NUM_DISHES_IN_MENU = 4;
    private String name, location;
    private final List<Dish> dishes;
    private final LocalDateTime date;

    // Create a constructor that takes a name, location, and list of dishes
    public Menu(String name, String location, List<Dish> dishes)
    {
        this.name = name;
        this.location = location;
        this.dishes = dishes;
        this.date = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String generateMenuOutput()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Preparing the data...\n");

        for (Dish dish : dishes)
        {
            sb.append("Generating...").append(dish).append("\n");

            for (int i = 0; i < dish.getIngredientsCount(); ++i)
            {
                sb.append("Ingredient ").append(i + 1).append(" added: ").append(dish.getIngredient(i)).append("\n");
            }
        }
        sb.append("Menu for today: ").append(this).append("\n");
        return sb.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu [name=").append(name);
        sb.append(", location=").append(location);
        sb.append(", day=").append(date).append("]");

        return sb.toString();
    }
}
