package chapterThree;

public class NewInvoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public NewInvoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        if(newQuantity < 0){
            newQuantity = 0;
            quantity = newQuantity;
        }
        else
        quantity = newQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            price = 0;
            this.price = price;
        }
        else{
            this.price = price;
        }

    }




    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;

    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String newPartDescription){
        partDescription = newPartDescription;
    }
    public String getPartDescription() {
        return partDescription;
    }

    public double getInvoiceAmount(){
        return getPrice() * getQuantity();
    }


}
