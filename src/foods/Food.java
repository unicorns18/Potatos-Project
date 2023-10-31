package foods;

public class Food
{
    private double proteins;
    private double calories;
    private double weights;
    private double price;

    public Food(double proteins, double calories, double weights, double price)
    {
        this.proteins = proteins;
        this.calories = calories;
        this.weights = weights;
        this.price = price;
    }

    public double getProteins() {
        return proteins;
    }

    public double getCalories() {
        return calories;
    }

    public double getWeights() {
        return weights;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setWeights(double weights) {
        this.weights = weights;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
    	this.price = price;
    }

    @Override
    public String toString()
    {
        return "Food [proteins=" + proteins + ", calories=" + calories + ", weights=" + weights + "]";
    }

}
