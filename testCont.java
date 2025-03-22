public class testCont {public static void main(String[] args) {
    Continents Asia = new Continents("ASIA");
    Continents Africa=new Continents("Africa");
    Continents Australia=new Continents("Australia");
    Continents Europe=new Continents("Europe");
    Continents America=new Continents("America");

    Africa.addCountry(new Countries("Nigeria"));
    Africa.addCountry(new Countries("South Africa"));
    Africa.addCountry(new Countries("Egypt"));
    Africa.addCountry(new Countries("Kenya"));
    Africa.addCountry(new Countries("Ghana"));


    Africa.countries.get(0).addCity(new Cities("Lagos", 200000.00));
    Africa.countries.get(0).addCity(new Cities("Abuja", 50000.00));
    Africa.countries.get(0).addCity(new Cities("Kano", 100000.00));
    Africa.countries.get(0).addCity(new Cities("Port Harcourt", 50000.00));
    Africa.countries.get(0).addCity(new Cities("Ibadan", 50000.00));

    Africa.countries.get(1).addCity(new Cities("Johannesburg", 200000.00));
    Africa.countries.get(1).addCity(new Cities("Cape Town", 300000.00));
    Africa.countries.get(1).addCity(new Cities("Durban", 400000.00));
    Africa.countries.get(1).addCity(new Cities("Pretoria", 200000.00));
    Africa.countries.get(1).addCity(new Cities("Bloemfontein", 200000.00));

    Africa.countries.get(2).addCity(new Cities("Cairo", 200000.00));
    Africa.countries.get(2).addCity(new Cities("Alexandria", 300000.00));
    Africa.countries.get(2).addCity(new Cities("Giza", 700000.00));
    Africa.countries.get(2).addCity(new Cities("Luxor", 200000.00));
    Africa.countries.get(2).addCity(new Cities("Aswan", 200000.00));

    Africa.countries.get(3).addCity(new Cities("Nairobi", 200000.00));
    Africa.countries.get(3).addCity(new Cities("Mombasa", 300000.00));
    Africa.countries.get(3).addCity(new Cities("Kisumu", 700000.00));
    Africa.countries.get(3).addCity(new Cities("Nakuru", 200000.00));
    Africa.countries.get(3).addCity(new Cities("Eldoret", 30000.00));

    Africa.countries.get(4).addCity(new Cities("Accra", 200000.00));
    Africa.countries.get(4).addCity(new Cities("Kumasi", 300000.00));
    Africa.countries.get(4).addCity(new Cities("Tamale", 700000.00));
    Africa.countries.get(4).addCity(new Cities("Takoradi", 200000.00));
    Africa.countries.get(4).addCity(new Cities("Cape Coast", 3000.00));

    Africa.calculatepop();

//    Asia.addCountry(new Country("Pakistan"));
//    Asia.addCountry(new Country("India"));
//    Asia.addCountry(new Country("China"));
//    Asia.addCountry(new Country("Afghanistan"));
//    Asia.addCountry(new Country("Bangladesh"));
//
//
//    Asia.countries.get(0).addCity(new City("Hyderabad", 200000.00));
//    Asia.countries.get(0).addCity(new City("Karachi", 50000.00));
//    Asia.countries.get(0).addCity(new City("Dadu", 100000.00));
//    Asia.countries.get(0).addCity(new City("Lahore", 50000.00));
//    Asia.countries.get(0).addCity(new City("Islamabad", 50000.00));
//
//    Asia.countries.get(1).addCity(new City("Delhi", 200000.00));
//    Asia.countries.get(1).addCity(new City("Agra", 300000.00));
//    Asia.countries.get(1).addCity(new City("Mumbai", 400000.00));
//    Asia.countries.get(1).addCity(new City("Bangalore", 200000.00));
//    Asia.countries.get(1).addCity(new City("Chennai", 200000.00));
//
//    Asia.countries.get(2).addCity(new City("Beijing", 200000.00));
//    Asia.countries.get(2).addCity(new City("Wuhan", 300000.00));
//    Asia.countries.get(2).addCity(new City("Shanghai", 700000.00));
//    Asia.countries.get(2).addCity(new City("Shenzen", 200000.00));
//    Asia.countries.get(2).addCity(new City("Harben", 200000.00));
//
//    Asia.countries.get(3).addCity(new City("Kabul", 200000.00));
//    Asia.countries.get(3).addCity(new City("Kandahar", 300000.00));
//    Asia.countries.get(3).addCity(new City("Jilalabad", 700000.00));
//    Asia.countries.get(3).addCity(new City("Herat", 200000.00));
//    Asia.countries.get(3).addCity(new City("Ghazni", 30000.00));
//
//    Asia.countries.get(4).addCity(new City("Dhaka", 200000.00));
//    Asia.countries.get(4).addCity(new City("Rangpur", 300000.00));
//    Asia.countries.get(4).addCity(new City("RajShahi", 700000.00));
//    Asia.countries.get(4).addCity(new City("Komila", 200000.00));
//    Asia.countries.get(4).addCity(new City("Bogra", 3000.00));
//
//    Asia.calculatepop();


    //System.out.println(Asia);
    System.out.println(Africa);

}

}
