package familySomething;

public class Husband {
    private Wife iyawo;
    public  Husband(Wife wife){
        iyawo = wife;
    }

    public void askWifeToCook(String cookWhat){
        System.out.println("Begging my wife to cook");
        switch(cookWhat){
            case "Indomie":
                System.out.println("Get Lost");
                break;
            case "Poundo":
                System.out.println("On my way Daddy Wa  ");
                break;
            case "Oha":
                System.out.println("O! ndi m oma");
                break;
                default:iyawo.cook();

        }

    }

}
