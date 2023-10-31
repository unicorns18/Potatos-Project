package foods;

public class Sandwich extends Food
{
    private String name;

    public Sandwich(double proteins, double calories, double weights)
    {
        super(proteins, calories, weights, 69);
        this.name = "Sandwich";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return "Sandwich [name=" + name + "; " + super.toString() + "]";
    }

}
