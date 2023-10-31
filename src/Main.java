import foods.Dish;
import foods.Food;
import foods.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Food[] foods = new Food[4];
        foods[0] = new foods.Salad(1.0, 2.0, 3.0);
        foods[1] = new foods.Sandwich(4.0, 5.0, 6.0);
        foods[2] = new foods.Soup(7.0, 8.0, 9.0);
        foods[3] = new foods.Pizza(10.0, 11.0, 12.0);

        List<Dish> dishes = new ArrayList<>();
        for (Food food : foods)
        {
            List<Food> listFoods = new ArrayList<>();
            listFoods.add(food);
            dishes.add(new Dish("Diet " + (dishes.size() + 1), listFoods));
        }
        Menu menu = new Menu("Spring Menu", "Shop 1", dishes);
        System.out.println(menu.generateMenuOutput());
    }
}
