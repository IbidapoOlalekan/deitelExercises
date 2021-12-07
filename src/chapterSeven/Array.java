package chapterSeven;

public class Array {
    public static void main(String[] args) {
        String[] noisemaker = new String[4];
        noisemaker[0] = "Chibuzor";
        //System.out.println(noisemaker[0]);
        noisemaker[1] = "Olalekan";
        //System.out.println(noisemaker[1]);
        noisemaker[2]= "Tolu";
        //System.out.println(noisemaker[2]);
        noisemaker[3] = "Tunji";
        //System.out.println(noisemaker[3]);
        for (int counter = 0; counter< noisemaker.length;counter++ ){
            System.out.println(noisemaker[counter]);
        }

    }
}
