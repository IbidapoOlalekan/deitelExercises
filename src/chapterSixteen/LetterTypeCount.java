package chapterSixteen;

import java.util.*;

public class LetterTypeCount {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMyMap(myMap);

        System.out.println(myMap);
    }

    private static void displayMyMap(Map<String, Integer> myMap) {
        Set<String> keys = myMap.keySet();

        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%2s%12s%n", "Letters", "Value");

        for (String key : sortedKeys) {
            System.out.printf("%2s%10s%n",key,myMap.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n",myMap.size(),myMap.isEmpty());

    }

    private static void createMap(Map<String, Integer> myMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();

        for (int i = 0 ; i < userInput.length() ; i++) {
            String key = String.format("%s",userInput.charAt(i)).toLowerCase();

            if (key.equals(""))
                continue;
            if (myMap.containsKey(key)){
                myMap.put(key,myMap.get(key) + 1);
            }
            else{
                myMap.put(key,1);
            }

        }
    }
}
