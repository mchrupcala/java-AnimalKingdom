package Animals;

public class Birds extends AbstractAnimals {

    public Birds(String name, int year) {
        MaxId++;
        this.id = MaxId;
        this.name = name;
        this.year = year;
    }

    @Override
    public String eatFood() {
        return "Eats slowly, enjoying every bite...then it looks over in your direction with a look in its eyes that says...you're next!";
    }

    @Override
    public String move() {
        return "Fly";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }

    @Override    
    public String toString()
    {
        return "Bird{" +
                "name='" + name + '\'' +
                ", year=" + year + '\'' +
                ", move=" + move() + '\'' +
                ", id=" + id + '\'' +
                '}';
    }
}