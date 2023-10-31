public class Food
{
    private final String name;
    private final double price, proteins, calories, weight;

    public Food(String name, double price, double proteins, double calories, double weight)
    {
        this.name = name;
        this.price = price;
        this.proteins = proteins;
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Dish [name=" + name + ", " + proteins + "g proteins, " + calories + " calories, " + weight + "g weight, $" + price + "]";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getProteins() {
        return proteins;
    }

    public double getCalories() {
        return calories;
    }

    public double getWeight() {
        return weight;
    }
}