import java.lang.reflect.Array;
import java.util.ArrayList;


public class Countries { String name;
    double population;
    public ArrayList<Cities> cities;

    public Countries(String name)
    {
        this.name = name;
        cities = new ArrayList<>();
    }

    public void addCity(Cities city)
    {
        cities.add(city);
    }

    public void calculatepop()
    {
        for(int i=0; i<cities.size(); i++)
        {
            this.population += cities.get(i).population;
        }
    }
    public String toString()
    {   System.out.println("Country :"+name+"\n"+name+" Poulation: "+population);
        for(int i=0; i<cities.size(); i++)
        {
            System.out.println(cities.get(i));
        }
        return "";
    }

}
