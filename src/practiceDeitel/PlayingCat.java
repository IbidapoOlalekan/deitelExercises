package practiceDeitel;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (temperature >=25 && temperature<= 35){
            return true;
        }
        else if (summer == true){
            if (temperature >= 25 && temperature <= 45){
                return true;
            }
        }
        return false;
    }
}
