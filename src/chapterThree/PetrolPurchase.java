package chapterThree;

public class PetrolPurchase {
    private String location;
    private String type;
    private int quantity;
    private double litre;
    private double discount;

    public PetrolPurchase(String location,String type,int quantity,double litre, double discount){
        this.location = location;
        this.type = type;
        this.quantity = quantity;
        this.litre = litre;
        this.discount = discount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getLitre() {
        return litre;
    }

    public double getDiscount() {
        return discount;
    }

    public double getInvoiceAmount(){
        return (getQuantity() * getLitre())- getDiscount();
    }
}
