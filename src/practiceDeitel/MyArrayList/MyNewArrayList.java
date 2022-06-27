package practiceDeitel.MyArrayList;

import java.util.Objects;

public class MyNewArrayList {
    private int size = 0;
    private String item = null;
    private String[] array = new String[5];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String element) {
        if(arrayIsFull()) resizeCapacity();
        array[size++] = element;

    }

    private void resizeCapacity() {
        String[] newArray = new String[array.length * 2];
        for(int i = 0; i < array.length; i++){
           newArray[i] = array[i];
        }
        array = newArray;

    }

    private boolean arrayIsFull() {
        return size == array.length;
    }

    public void remove(String element) {
        remove(findIndexByName(element));

    }

    private int findIndexByName(String element) {
        for (int i = 0; i < size    ;i++){
            if (Objects.equals(array[i], element))return i;
        }
        throw new IllegalArgumentException("Element not found");

    }


    public int size() {
        return size;
    }

    public String get(int index) {
        return array[index];
    }

    public int capacity() {
        return  array.length;
    }

    public void remove(int index) {
        for (int i = index; i < size ; i++){
            if (array[index].equals(array[i])){
                array[i] = array[i + 1];
            }
            array[size] = null;
        }
        size--;
    }
}
