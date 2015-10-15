
package model;


public class Cities {
    
    private int cityID;
    private int cityPopulation;
    private String cityLocation;
    private int cityFounded;
    private String cityName;

    public Cities() {
        this.cityID = 0;
        this.cityPopulation = 0;
        this.cityLocation = "";
        this.cityFounded = 0;
        this.cityName = "";
    }
    
    
    public Cities(int cityID, int cityPopulation, String cityLocation, int cityFounded, String cityName) {
        this.cityID = cityID;
        this.cityPopulation = cityPopulation;
        this.cityLocation = cityLocation;
        this.cityFounded = cityFounded;
        this.cityName = cityName;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public String getCityLocation() {
        return cityLocation;
    }

    public void setCityLocation(String cityLocation) {
        this.cityLocation = cityLocation;
    }

    public int getCityFounded() {
        return cityFounded;
    }

    public void setCityFounded(int cityFounded) {
        this.cityFounded = cityFounded;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Cities{" + "cityID=" + cityID + ", cityPopulation=" + cityPopulation + ", cityLocation=" + cityLocation + ", cityFounded=" + cityFounded + ", cityName=" + cityName + '}';
    }
    
    
}
