package chapterTen.carbonFootPrint;

public class Car implements CarbonFootPrint{

    private static double FOOTPRINT_PER_MILE_PER_GALLON = .08765;

    private String id;
    private double miles;
    private double milesPerGallons;

    public Car(String id, double miles, double milesPerGallons) {
        setId(id);
        setMiles(miles);
        setMilesPerGallons(milesPerGallons);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getMilesPerGallons() {
        return milesPerGallons;
    }

    public void setMilesPerGallons(double milesPerGallons) {
        this.milesPerGallons = milesPerGallons;
    }

    @Override
    public double getCarbonFootprint() {
        return ((FOOTPRINT_PER_MILE_PER_GALLON * getMiles())/getMilesPerGallons());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("id='").append(id).append('\'');
        sb.append(", miles=").append(miles);
        sb.append(", milesPerGallons=").append(milesPerGallons);
        sb.append('}');
        return sb.toString();
    }
}
