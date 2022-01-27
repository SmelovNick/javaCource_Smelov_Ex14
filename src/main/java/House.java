import java.util.Comparator;

public class House{
    private String address;
    private int year;
    private int entranceCount;
    private int apartmentsCount;
    private int floorCount;
    private double floorHeight;
    private String style;

    public House(String address, int year, int entranceCount, int apartmentsCount, int floorCount, double floorHeight, String style) {
        this.address = address;
        this.year = year;
        this.entranceCount = entranceCount;
        this.apartmentsCount = apartmentsCount;
        this.floorCount = floorCount;
        this.floorHeight = floorHeight;
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEntranceCount() {
        return entranceCount;
    }

    public void setEntranceCount(int entranceCount) {
        this.entranceCount = entranceCount;
    }

    public int getApartmentsCount() {
        return apartmentsCount;
    }

    public void setApartmentsCount(int apartmentsCount) {
        this.apartmentsCount = apartmentsCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public double getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(double floorHeight) {
        this.floorHeight = floorHeight;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", year=" + year +
                ", entranceCount=" + entranceCount +
                ", apartmentsCount=" + apartmentsCount +
                ", floorCount=" + floorCount +
                ", floorHeight=" + floorHeight +
                '}';
    }

}
