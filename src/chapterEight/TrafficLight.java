package chapterEight;

public enum TrafficLight {
    RED(30),YELLOW(5),GREEN(50);

    private int[] duration;
    TrafficLight(int...duration){
        this.duration = duration;
    }

    public int[] getDuration() {
        return duration;
    }
}
