package Animals;

public class Fish extends AbstractAnimals {

    public Fish(String name, int year) {
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
        return "Swim";
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
        return "Gills";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }

    @Override    
    public String toString()
    {
        return "Fish{" +
                "name='" + name + '\'' +
                ", year=" + year + '\'' +
                ", move=" + move() + '\'' +
                ", id=" + id + '\'' +
                '}';
    }
}