package practiceDeitel.inheritance;

public class Animal {

    private String name;
    private int brian;
    private int body;
    private int size;
    private int weight;
    public Animal(String name, int brian, int body, int size, int weight) {
        this.name = name;
        this.brian = brian;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){

    }
    public void move(){

    }
    public String getName() {
        return name;
    }

    public int getBrian() {
        return brian;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }


}
