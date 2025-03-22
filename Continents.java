
import java.util.ArrayList;

public class Continents { String name;
    double population;
    public ArrayList<Countries> countries;

    public Continents(String name)
    {
        this.name = name;
        countries = new ArrayList<>();
    }

    public void addCountry(Countries country)
    {
        countries.add(country);
    }

    public void calculatepop()
    {
        for(int i=0; i<countries.size(); i++)
        {   countries.get(i).calculatepop();
            this.population += countries.get(i).population;
        }
    }

    public String toString()
    {   System.out.println("Continent :"+name+"\n"+name+" Poulation: "+population);
        for(int i=0; i<countries.size(); i++)
        {
            System.out.println(countries.get(i));
        }
        return "";
    }

}
