package chapterThree;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("Lagos","PMS",50,65,500);

        System.out.printf("Lekan bought petrol in %s and the invoice amount is %.2f",petrol.getLocation(),petrol.getInvoiceAmount());
    }
}
