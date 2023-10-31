package foods;

public class Soup extends Food
{
    private String name;

    public Soup(double proteins, double calories, double weights)
    {
        super(proteins, calories, weights, 15);
        this.name = "Soup";
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
        return "Soup [name=" + name + "; " + super.toString() + "]";
    }
}
