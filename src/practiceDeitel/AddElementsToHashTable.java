package practiceDeitel;

import java.util.Hashtable;

public class AddElementsToHashTable {
    public static void main(String[] args) {

        Hashtable<Integer,String> ht1 = new Hashtable<Integer,String>();
        ht1.put(1,"Boy");
        ht1.put(2,"Bob");
        ht1.put(3,"Kenny");
        System.out.println("Mapping of ht1 : " + ht1);
    }

}
