public class City  {
    private String nameOfCity;
    private int zipCode;
    private int populationOfCity;
    private String coordinates;
    private  int areaOfCity;
    private String climate;

    //setter


    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setPopulationOfCity(int populationOfCity) {
        this.populationOfCity = populationOfCity;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public void setAreaOfCity(int areaOfCity) {
        this.areaOfCity = areaOfCity;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }
    //getter

    public String getNameOfCity() {
        return nameOfCity;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getPopulationOfCity() {
        return populationOfCity;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public int getAreaOfCity() {
        return areaOfCity;
    }

    public String getClimate() {
        return climate;
    }
}


