package foods;

public class Salad extends Food
{
    private String name;

    public Salad(double proteins, double calories, double weights)
    {
        super(proteins, calories, weights, 420);
        this.name = "Salad";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Salad [name=" + name + "; " + super.toString() + "]";
    }
}
