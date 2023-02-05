public class Main {
    public static void main(String[] args) {
        Person person =new Person();
        person.setFirstName("Aida");
        person.setLastName("Ikramova");
        person.setDateOfBirth("30.06.1994");
        person.setGender("Female");
        person.setCitizenship("Kyrgyzstan");

        Person person1=new Person();
        person1.setFirstName("Nazgul");
        person1.setLastName("Shergazieva");
        person1.setDateOfBirth("30.08.1993");
        person1.setGender("Female");
        person1.setCitizenship("Kyrgyzstan");

        Person person2 = new Person();
        person2.setFirstName("Fatmanur");
        person2.setLastName("Adiguzel");
        person2.setDateOfBirth("03.06.1997");
        person2.setGender("Female");
        person2.setCitizenship("Turkey");

        Country country=new Country();
        country.setNameOfCountry("USA");
        country.setCapital("Washington D.C");
        country.setCountryCode(+1);
        country.setOfficialLanguage("English");
        country.setArea(9834000);
        country.setPopulation(333287557);
        country.setGdp(25);

        Country country1=new Country();
        country1.setNameOfCountry("USA");
        country1.setCapital("Washington D.C");
        country1.setCountryCode(+1);
        country1.setOfficialLanguage("English");
        country1.setPopulation(333287557);
        country1.setArea(9834000);
        country1.setGdp(25);

        Country country2= new Country();
        country2.setNameOfCountry("Turkey");
        country2.setCapital("Ankara");
        country2.setCountryCode(+90);
        country2.setOfficialLanguage("Turkish");
        country2.setPopulation(85000000);
        country2.setArea(753562);
        country2.setGdp(819);

        City city = new City();
        city.setNameOfCity("Chicago");
        city.setZipCode(60601);
        city.setClimate("typically continental");
        city.setAreaOfCity(607);
        city.setPopulationOfCity(2500000);
        city.setCoordinates("41° 52' 54.5952'' N and 87° 37' 23.4372'' W");

        City city1=new City();
        city1.setNameOfCity("Pennsylvania");
        city1.setZipCode(19120);
        city1.setPopulationOfCity(12000000);
        city1.setAreaOfCity(119282);
        city1.setClimate("humid continental climate");
        city1.setCoordinates("41° 12' 11.9628'' N and 77° 11' 40.2972'' W.");

        City city2=new City();
        city2.setNameOfCity("Izmir");
        city2.setZipCode(35000);
        city2.setCoordinates("38° 25' 25.4388'' N and 27° 8' 34.1736'' E.");
        city2.setPopulationOfCity(3056000);
        city2.setAreaOfCity(12);
        city2.setClimate("summers are hot, arid, and clear and the winters are long, cold, wet, windy, and partly cloudy");

        Address address=new Address();
        address.setCountry("USA");
        address.setState("Chicago");
        address.setPhone(999151623);
        address.setFax(3568);
        address.setEmail("missaidaikramova@gmail.com");
        address.setSite("www.aida.com");

        Address address1=new Address();
        address1.setCountry("USA");
        address1.setState("Pennsylvania");
        address1.setPhone(771952498);
        address1.setFax(45789);
        address1.setEmail("shergazieva@gmail.com");
        address1.setSite("www.shergazieva.com");

        Address address2=new Address();
        address2.setCountry("Turkey");
        address2.setPhone(9078548);
        address2.setFax(5678);
        address2.setEmail("adyguzel@gmail.com");
        address2.setSite("www.fatmanur.tr.com");

        System.out.println("My name is "+person.getFirstName()+",last name is "+person.getLastName()+",I was born in "+person.getDateOfBirth()+" and I am "+person.getGender()+" in addition my citizenship is "+person.getCitizenship()+".");
        System.out.println("My name is "+person1.getFirstName()+",last name is "+person1.getLastName()+",I was born in "+person1.getDateOfBirth()+" and I am "+person1.getGender()+" in addition my citizenship is "+person1.getCitizenship()+".");
        System.out.println("My name is "+person2.getFirstName()+",last name is "+person2.getLastName()+",I was born in "+person2.getDateOfBirth()+" and I am "+person2.getGender()+" in addition my citizenship is "+person2.getCitizenship()+".");
        System.out.println("\n");
        System.out.println("Country: "+country.getNameOfCountry()+".Capital of country:"+country.getCapital()+".Code of country:"+country.getCountryCode()+".Official language:"+country.getOfficialLanguage()+".Area:"+country.getArea()+"Population:"+country.getPopulation()+"GDP:"+country.getGdp()+"$ trillion");
        System.out.println("Country: "+country1.getNameOfCountry()+".Capital of country:"+country1.getCapital()+".Code of country:"+country1.getCountryCode()+".Official language:"+country1.getOfficialLanguage()+".Area:"+country1.getArea()+".Population:"+country1.getPopulation()+".GDP:"+country1.getGdp()+"$ trillion");
        System.out.println("Country: "+country2.getNameOfCountry()+".Capital of country:"+country2.getCapital()+".Code of country:"+country2.getCountryCode()+".Official language:"+country2.getOfficialLanguage()+".Area:"+country2.getArea()+".Population:"+country2.getPopulation()+".GDP:"+country2.getGdp()+"$ billion");
        System.out.println("City:"+city.getNameOfCity()+" " +
                "\nZip Code:"+city.getZipCode()+
                "\nCoordinates:"+city.getCoordinates()+
                "\nArea:"+city.getAreaOfCity()+
                "\nPopulation"+city.getPopulationOfCity()+
                "\nClimate:"+city.getClimate());
        System.out.println("\n");
        System.out.println("City:"+city1.getNameOfCity()+" " +
                "\nZip Code:"+city1.getZipCode()+
                "\nCoordinates:"+city1.getCoordinates()+
                "\nArea:"+city1.getAreaOfCity()+
                "\nPopulation"+city1.getPopulationOfCity()+
                "\nClimate:"+city1.getClimate());
        System.out.println("\n");
        System.out.println("City:"+city2.getNameOfCity()+" " +
                "\nZip Code:"+city2.getZipCode()+
                "\nCoordinates:"+city2.getCoordinates()+
                "\nArea:"+city2.getAreaOfCity()+
                "\nPopulation:"+city2.getPopulationOfCity()+
                "\nClimate:"+city2.getClimate());
        System.out.println("\n");
        System.out.println("Country:"+address.getCountry()+ "\n"+address.getState()+"\nPhone:"+address.getPhone()+"\nFax:"+address.getFax()+"\nEmail:"+address.getEmail()+"\nSite:"+address.getSite());
        System.out.println("__________________________________________________");
        System.out.println("Country:"+address1.getCountry()+ "\n"+address1.getState()+"\nPhone:"+address1.getPhone()+"\nFax:"+address1.getFax()+"\nEmail:"+address1.getEmail()+"\nSite:"+address1.getSite());
        System.out.println("__________________________________________________");
        System.out.println("Country:"+address2.getCountry()+ "\n"+address2.getState()+"\nPhone:"+address2.getPhone()+"\nFax:"+address2.getFax()+"\nEmail:"+address2.getEmail()+"\nSite:"+address2.getSite());

    }
}