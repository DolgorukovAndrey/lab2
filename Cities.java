import java.util.ArrayList;

public class Cities {
    private String cityName;
    private ArrayList<Way> ways;

    public Cities() {
        this.ways = new ArrayList<>();
    }

    public Cities(String cityName) {
        this.cityName = cityName;
        this.ways = new ArrayList<>();
    }

    public Cities(String cityName, ArrayList<Way> ways) {
        this.cityName = cityName;
        this.ways = new ArrayList<>(ways);
    }

    public String toString() {
        String str;
        str = "Город: " + cityName + "\n";
        str += "Дороги: ";
        for (int i = 0; i < ways.size(); i++) {
            str = str + ways.get(i).getTitle() + ":" + ways.get(i).getPrice() + " ";
        }
        return str;
    }

    public String getCityName() {
        return cityName;
    }

    public ArrayList<Way> getWays() {
        return new ArrayList<>(ways);
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setWays(ArrayList<Way> ways) {
        this.ways = new ArrayList<>(ways);
    }
}
