package Animals;

//fields
// methods
// 'abstract' methods

public abstract class AbstractAnimals {

    protected static int MaxId = 0;
    protected int id;
    protected String name;
    protected int year;

    public abstract String eatFood();

    public abstract String getName();

    public abstract String move();

    public abstract String breathe();

    public abstract String reproduce();

    public abstract int getYear();


}