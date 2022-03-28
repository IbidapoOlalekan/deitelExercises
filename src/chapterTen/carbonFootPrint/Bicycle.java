package chapterTen.carbonFootPrint;

public class Bicycle implements CarbonFootPrint{
    private static double FOOTPRINT_PER_MILE_AVERAGE = 50;
    private static double FOOTPRINT_PER_MILE_BY_BANANAS = 65;
    private static double FOOTPRINT_PER_MILE_BY_CEREAL_WITH_MILK = 90;
    private static double FOOTPRINT_PER_MILE_BY_BACON = 200;
    private static double FOOTPRINT_PER_MILE_BY_CHEESEBURGERS = 260;
    private static double FOOTPRINT_PER_MILE_BY_AIR_FREIGHTED_ASPARAGUS = 2800;

    private static double GRAM_TO_METRIC_TON_MUTIPLIER = .000001;

    private String id;
    private double miles;
    private PowerSource powerSource;

    public Bicycle(String id, double miles, PowerSource powerSource) {
       setId(id);
        setMiles(miles);
        setPowerSource(powerSource);
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

    public PowerSource getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(PowerSource powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public double getCarbonFootprint() {
        double footPrint = 0;
        switch (getPowerSource()){
            case AIR_FREIGHTED_ASPARAGUS ->  footPrint = getMiles() * FOOTPRINT_PER_MILE_BY_AIR_FREIGHTED_ASPARAGUS;
            case BACON -> footPrint = getMiles() * FOOTPRINT_PER_MILE_BY_BACON;
            case BANANAS -> footPrint = getMiles() * FOOTPRINT_PER_MILE_BY_BANANAS;
            case CEREALS_WITH_MILK -> footPrint = getMiles() * FOOTPRINT_PER_MILE_BY_CEREAL_WITH_MILK;
            case CHEESEBURGER -> footPrint = getMiles() * FOOTPRINT_PER_MILE_BY_CHEESEBURGERS;
            default -> footPrint = getMiles() * FOOTPRINT_PER_MILE_AVERAGE;
        }

        return footPrint * GRAM_TO_METRIC_TON_MUTIPLIER;
    }
}
