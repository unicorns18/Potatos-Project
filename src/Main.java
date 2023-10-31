import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Preparing the data...");
        Food[] data = new Food[5];
        data[0] = new Food("Burger", 2.4, 25, 250, 250);
        data[1] = new Food("Pizza", 3.2, 15, 300, 300);
        data[2] = new Food("Salad", 1.5, 5, 100, 150);
        data[3] = new Food("Soup", 1.2, 8, 150, 200);
        data[4] = new Food("Sandwich", 2.0, 10, 200, 250);
        System.out.println("Data is ready.");
        System.out.println("Printing the data...");

        for (int i = 0; i < data.length; i++)
        {
            System.out.println("Dish [name=Diet n." + (i + 1) + ", 0 ingredients, price " + data[i].getPrice() + "]");
            Ingredient ingredient1 = new Ingredient("Ingredient 1 added", data[i]);
            Ingredient ingredient2 = new Ingredient("Ingredient 2 added", data[i]);
            System.out.println(ingredient1 + ": " + new Food("Cereal", 19.3, 32.4, 110, 200));
            System.out.println(ingredient2 + ": " + new Food("Fish", 31.3, 25.3, 200, 300));
        }
    }
}













