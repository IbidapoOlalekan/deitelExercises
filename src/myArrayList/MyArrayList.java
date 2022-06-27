//package myArrayList;
//
//public class MyArrayList {
//
//    private int size = 0;
//    private boolean isNull = false;
//    private String[] array = new String[5];
//    private int count = 0;
//
//    private String[] array = new String[5];
//    String[] newArray = new String[array.length];
//    private boolean isEmpty;
//    private int size = 0;
//    private int capacity = array.length;
//    private String temp;
//
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public void add(String element) {
//        size++;
//    }
//
//    public boolean isNull() {
//        return isEmpty();
//        expandCapacityOfArray();
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]== null){
//                array[i] = element;
//                size++;
//                break;
//            }
//        }
//    }
//
//
//    public int getSize() {
//        return size;
//    }
//
//    public void expandCapacityOfArray() {
//        if (getSize() == array.length){
//            newArray = array;
//            array = new String[array.length * 2];
//
//            System.arraycopy(newArray,0,array,0,newArray.length);
//        }
//    }
//
//    public String[] getList() {
//        return array;
//    }
//
//    public void addListByIndex(String element, int index) {
//        for (int i= getSize(); i > index;i--){
//            array[i] = array[i - 1];
//        }
//        array[index] = element;
//        size++;
//    }
//
//    public void removeListByIndex(int index) {
//        for (int i = index; i < array.length - 1; i++){
//            array[i] = null;
//            temp = array[i];
//            array[i]=array[i+1];
//        }
//        array[array.length-1] = temp;
//        size--;
//    }
//
//    public void getElementAtIndex(int index) {
//        for(int i = 0; i < array.length; i++){
//            if (i == index){
//                temp = array[i];
//            }
//        }
//    }
//
//    public String getTemp() {
//        return temp;
//    }
//}
