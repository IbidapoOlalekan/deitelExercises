package televisionApp;

import java.util.Scanner;

public class TelevisionApp {

    public static void main(String[] args) {
        Television television = new Television("Samsung TV");
        displayPrompt();
        Scanner userInput = new Scanner(System.in);
        int response = userInput.nextInt();

        do {

            switch (response){
                case 1:
                    userInput.nextLine();
                    System.out.printf("You switched On %s Television!!!!%n",television.getName());

                do {
                    televisionApp();
                }


                while (true);



                case 2:
                    System.exit(0);
                default:
                    System.out.println("Enter the right choice");

            }

        }
        while (response != 1 && response != 2);
    }

    public static void displayPrompt(){
        String prompt = """

                1.Power On
                2. Power Off

                """;
        System.out.println(prompt);
    }
    public static void televisionApp(){
        Television television = new Television("Samsung TV");
        Scanner scanner = new Scanner(System.in);
        int newTvAppPrompt;
        String televisionApp = """
                1. Set Channel
                2. Change Channel
                3. Increase Volume
                4. Decrease Volume
                5. Mute
                6. Go Back
                7. Exit
                """;
        System.out.println(televisionApp);
        newTvAppPrompt = scanner.nextInt();
        switch (newTvAppPrompt){
            case 1:
                System.out.println("What Channel do you want to change it to");
                int channel = scanner.nextInt();
                television.setChannel(channel);
                System.out.println("\n The channel is " + channel);
                break;
            case 2:
                System.out.println("Change Channel");
                television.changeChannel();
                int newChannel = television.getChannel();
                 newChannel++;
                System.out.println("\n\n The channel is" + newChannel);
                break;
            case 3:
                System.out.println("Increase Volume");
                television.increaseVolumeTest();

                System.out.println("\n\n The volume is" + television.getVolume());
                break;
            case 4:
                System.out.println("Decrease Volume");
                television.decreaseVolume();
                System.out.printf("The volume is %d",television.getVolume());
                break;


        }
    }


}
