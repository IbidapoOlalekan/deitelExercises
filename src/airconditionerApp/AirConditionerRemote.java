package airconditionerApp;

import java.util.Scanner;

public class AirConditionerRemote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        displayOnPrompt();
        int response = 0;
        AirConditioner samsungAirConditioner = new AirConditioner("Samsung Air Conditioner");

        do {
            displayOnPrompt();
            response = scan.nextInt();
            switch (response){
                case 1:
                    samsungAirConditioner.turnOn();
                    System.out.println("Air Conditioner Is Powered On!!!!!!");
                    int function;
                    do {
                        functionPrompt();
                        function = scan.nextInt();
                        switch (function){
                            case 1:
                                display("Increasing Temperature");
                                samsungAirConditioner.increaseTemperature();
                                display(" ");
                                display("The temperature is " + samsungAirConditioner.getTemperature());
                                break;
                            case 2:
                                display("Decreasing Temperature");
                                samsungAirConditioner.decreaseTemperature();
                                display(" ");
                                display("The temperature is " + samsungAirConditioner.getTemperature());
                                break;
                            case 3:
                                display("Fan!!!!!!!");
                                break;
                            case 4:
                                display("Swing!!!!!!");
                                break;
                            case 5:
                                display("Powering Off");
                                samsungAirConditioner.turnOff();
                                System.exit(0);
                        }

                    }
                    while (true);


                case 2:
                    display("Power Off");
                    samsungAirConditioner.turnOff();
                    System.exit(0);
            }
        }
        while (response != 1);

    }

    public static void displayOnPrompt(){
        String onPrompt = """
                1. Power On
                2. Power Off
                """;
        display(onPrompt);
    }

    public static void display(String message){
        System.out.println(message);
    }
    public static void functionPrompt(){
        String functionPrompt = """
                1. Increase Temperature
                2. Decrease Temperature
                3. Fan
                4. Swing
                5. Power Off
                """;
        display(functionPrompt);
    }
}
