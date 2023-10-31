package foods;

public class Pizza extends Food
{
    private String name;

    public Pizza(double proteins, double calories, double weights)
    {
        super(proteins, calories, weights, 20);
        this.name = "Pizza";
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
        return "Pizza [name=" + name + "; " + super.toString() + "]";
    }
}