public class Country {
    private String nameOfCountry;
    private String officialLanguage;
    private String capital;
    private int countryCode;
    private int area;
    private int  population;
    private int gdp;
    //setter


    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }
    //getter

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public String getCapital() {
        return capital;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public int getGdp() {
        return gdp;
    }
}
