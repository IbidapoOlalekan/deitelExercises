package chapterTen.carbonFootPrint;

public class Home implements CarbonFootPrint{

    private static double COAL_PER_ONE_KWH = 0.00034;
    private static double ELECTRICITY_PER_ONE_KWH = 0.00059;
    private static double HEATING_OIL_PER_ONE_KWH = 0.00028;
    private static double LPG_PER_ONE_KWH = 0.00021;
    private static double NATURAL_GAS_PER_ONE_KWH = 0.00018;
    private static double PROPANE_PER_ONE_GALLON = 0.00579;
    private static double WOODEN_PELLETS_PER_ONE_METRIC_TON = 0.00774;

    private double coal;
    private double electricity;
    private double heatingOil;
    private String id;
    private double lpg;
    private double naturalGas;
    private int numberOfPeople;
    private double propane;
    private double woodenPellets;


    public Home(double coal, double electricity, double heatingOil, String id, double lpg, double naturalGas, int numberOfPeople, double propane, double woodenPellets) {
        this.coal = coal;
        this.electricity = electricity;
        this.heatingOil = heatingOil;
        this.id = id;
        this.lpg = lpg;
        this.naturalGas = naturalGas;
        this.numberOfPeople = numberOfPeople;
        this.propane = propane;
        this.woodenPellets = woodenPellets;
    }

    public double getCoal() {
        return coal;
    }

    public void setCoal(double coal) {
        this.coal = coal;
    }

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public double getHeatingOil() {
        return heatingOil;
    }

    public void setHeatingOil(double heatingOil) {
        this.heatingOil = heatingOil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLpg() {
        return lpg;
    }

    public void setLpg(double lpg) {
        this.lpg = lpg;
    }

    public double getNaturalGas() {
        return naturalGas;
    }

    public void setNaturalGas(double naturalGas) {
        this.naturalGas = naturalGas;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getPropane() {
        return propane;
    }

    public void setPropane(double propane) {
        this.propane = propane;
    }

    public double getWoodenPellets() {
        return woodenPellets;
    }

    public void setWoodenPellets(double woodenPellets) {
        this.woodenPellets = woodenPellets;
    }
    public double addCoal(double carbonFootPrint){
        return computeItems(carbonFootPrint, coal, COAL_PER_ONE_KWH);
    }

    public double addElectricity(double carbonFootPrint){
        return computeItems(carbonFootPrint,electricity,ELECTRICITY_PER_ONE_KWH);
    }

    public double addHeatingOil(double carbonFootPrint){
        return computeItems(carbonFootPrint,heatingOil,HEATING_OIL_PER_ONE_KWH);
    }

    public double addLpg(double carbonFootPrint){
        return computeItems(carbonFootPrint,lpg,LPG_PER_ONE_KWH);
    }

    public double addNaturalGas(double carbonFootPrint){
        return computeItems(carbonFootPrint,naturalGas,NATURAL_GAS_PER_ONE_KWH);
    }

    public double addPropane(double carbonFootPrint){
        return computeItems(carbonFootPrint,propane,PROPANE_PER_ONE_GALLON);
    }

    public double addWoodenPellets(double carbonFootPrint){
        return computeItems(carbonFootPrint,woodenPellets,WOODEN_PELLETS_PER_ONE_METRIC_TON);
    }



    private double computeItems(double carbonFootPrint, double amount, double multiplier){
        return carbonFootPrint + (amount * multiplier);
    }

    @Override
    public double getCarbonFootprint() {
        double carbonFootPrint = 0;
         carbonFootPrint = addElectricity(carbonFootPrint);
         carbonFootPrint = addCoal(carbonFootPrint);
         carbonFootPrint = addWoodenPellets(carbonFootPrint);
         carbonFootPrint = addLpg(carbonFootPrint);
         carbonFootPrint = addHeatingOil(carbonFootPrint);
         carbonFootPrint = addPropane(carbonFootPrint);
         carbonFootPrint = addNaturalGas(carbonFootPrint);
        return carbonFootPrint;
    }

    public String toString(){
        CarbonFootPrintServices services = new CarbonFootPrintServices();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getId());
        stringBuilder.append("\nNumber of people: " + getNumberOfPeople());
        if (getElectricity() > 0){
            stringBuilder.append("\n Electricity used (kwh): " + services.toCommaNumber(getElectricity()));
        }
        if (getHeatingOil() > 0){
            stringBuilder.append("\n Heating used (kwH): " + services.toCommaNumber(getHeatingOil()));
        }
        if(getCoal() > 0){
            stringBuilder.append("\n Coal Used (kwh) : " + services.toCommaNumber(getCoal()));
        }
        if(getLpg() > 0){
            stringBuilder.append("\n Lpg Used(kwh) : " + services.toCommaNumber(getLpg()));
        }
        if (getPropane() > 0){
            stringBuilder.append("\n Propane used (kwh) : " + services.toCommaNumber(getPropane()));
        }
        if (getWoodenPellets() > 0){
            stringBuilder.append("\nWooden pellets used (kwh): " + services.toCommaNumber(getWoodenPellets()));
        }

        return stringBuilder.toString();
    }
}
