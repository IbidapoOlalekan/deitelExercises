package practiceDeitel;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes < 0){
            display("Invalid Value");
        }
        else {
            int megabytes = kilobytes / 1024;
            int remainingKiloBytes = kilobytes % 1024;
            display(kilobytes + "KB = " + megabytes + " MB and " + remainingKiloBytes + " KB ");
        }
    }

    public static void display(String message){
        System.out.println(message);
    }

}
