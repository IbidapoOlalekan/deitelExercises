package myArrayList;

public class MyArrayList {

    private int size = 0;
    private boolean isNull = false;
    private String[] array = new String[5];
    private int count = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String element) {
        size++;
    }

    public boolean isNull() {
        return isEmpty();
    }
}
