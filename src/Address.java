public class Address {
    private String country;
    private String state;
    private long phone;
    private int fax;
    private String email;
    private  String site;
//setter

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSite(String site) {
        this.site = site;
    }
    //getter

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public long getPhone() {
        return phone;
    }

    public int getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getSite() {
        return site;
    }
}
