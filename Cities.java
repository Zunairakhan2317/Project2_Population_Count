public class Cities { String cityName;
    double population;
    public Cities(String cityName ,double population){
        this.cityName=cityName;
        this.population=population;
    }


    public String toString() {
        return "city :" + cityName + " \t  population: " + population;
    }

}
