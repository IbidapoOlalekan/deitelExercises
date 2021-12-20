package bikeApp;

import java.util.Scanner;

public class AutomaticBike {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        onPrompt();
        int onPrompt = 0;
        Bike hondaBike = new Bike("Honda Bike");

        do {
            onPrompt();
            onPrompt = scan.nextInt();
            switch (onPrompt){
                case 1:
                    scan.nextLine();
                    System.out.println("The Bike Is On");
                    hondaBike.turnOn();
                    boolean on = hondaBike.isOn();
                    System.out.println(hondaBike.isOn());


                    int newBikePromptResponse;
                    do {
                        String newBikePrompt = """
                                1. Accelerate
                                2. Decelerate
                                """;
                        System.out.println(newBikePrompt);
                        newBikePromptResponse = scan.nextInt();
                        switch (newBikePromptResponse){
                            case 1:

                                System.out.println("Set The Gear: ");
                                int gear = scan.nextInt();
//                                hondaBike.setGear();
//                                int gear = hondaBike.getGear();
                                hondaBike.accelerate(gear);
                                System.out.println("Accelerating!!!!!");
                                System.out.println("Bike Speed is " + hondaBike.getSpeed());
                                hondaBike.setGear();
                                gear = hondaBike.getGear();
                                System.out.println("The gear is " + gear);
                                break;

                            case 2:
                                System.out.println("Set the Gear: ");
                                 gear = scan.nextInt();
                                 hondaBike.decelerate(gear);
                                System.out.println("Decelerating");
                                System.out.println("Bike Speed is" + hondaBike.getSpeed());
                                hondaBike.setGear();
                                gear = hondaBike.getGear();
                                System.out.println("The gear is " + gear);


                                break;

                        }
                    }
                    while (true);

                case 2:
                    System.exit(0);
                default:

            }
        }
        while (onPrompt != 1 && onPrompt!=2);


    }

    public static void onPrompt(){
        String prompt = """
                1. Power On
                2. Power Off
                """;
        System.out.println(prompt);
    }


}

