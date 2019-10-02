package Animals;

public class Mammals extends AbstractAnimals {

    public Mammals(String name, int year) {
        // super(name, year);
        // super(year);
        
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
        return "Walk";
    }

    @Override
    public String breathe() {
        return "Breathe";
    }

    @Override
    public String reproduce() {
        return "Live births";
    }

    @Override    
    public String toString()
    {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", year=" + year + '\'' +
                ", move=" + move() + '\'' +
                '}';
    }
}