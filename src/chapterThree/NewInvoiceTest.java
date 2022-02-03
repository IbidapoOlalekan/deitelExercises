package chapterThree;

public class NewInvoiceTest {
    public static void main(String[] args) {
        NewInvoice newInvoiceTest = new NewInvoice("001","Milo",21,300);
        System.out.println(newInvoiceTest.getPartNumber());
        System.out.println(newInvoiceTest.getInvoiceAmount());;
    }
}

