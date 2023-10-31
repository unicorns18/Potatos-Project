package foods;

public class Burger extends Food
{
    private String name;

    public Burger(double proteins, double calories, double weights)
    {
        super(proteins, calories, weights, 10);
        this.name = "Burger";
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
        return "Burger [name=" + name + "; " + super.toString() + "]";
    }
}
