package chapterFourteen;

public class StringUtils {
    private String string;

    public StringUtils(String string) {
        this.string = string;
    }

    public int _lastIndexOf(char character){
        int returnIndex =  -1;
        for(int i = 0; i < string.length();i++){
            if (string.charAt(i) == character) {
                returnIndex = i;
            }
        }
        return returnIndex;
    }

    public int _lastIndexOf(boolean shouldIgnoreCase, char character){

        int _index = -1;
        if (shouldIgnoreCase){
            string = string.toLowerCase();
            character = Character.toLowerCase(character);
                for (int i = 0; i < string.length();i++){
                    if (string.charAt(i) == character){
                        _index = i;
                    }
                }
        }
        else{
            _lastIndexOf(character);
        }

        return _index;
    }

    public int _indexOf(boolean shouldIgnoreCase, char character){

        int _index = -1;
        if (shouldIgnoreCase){
            string = string.toLowerCase();
            character = Character.toLowerCase(character);
            for (int i = 0; i < string.length();i++){
                if (string.charAt(i) == character){
                    return i;
                }
            }
        }
        else{
            _indexOf(character);
        }

        return _index;
    }

    public int _indexOf(char character) {
        int _index = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                return i ;
            }
        }
        return _index;
    }

    public int _countOf(char character){
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
