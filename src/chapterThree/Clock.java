package chapterThree;

import java.security.PublicKey;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        if (hour > 23){
            hour = 0;
            minute = 0;
            second = 0;
        }
        this.hour = hour;

        if (minute > 59){
            hour = 0;
            minute = 0;
            second = 0;
        }
        this.minute = minute;

        if (second > 59){
            hour = 0;
            minute = 0;
            second = 0;
        }
        this.second = second;

    }

    public void setHour(int hour) {
        if (hour > 23){
            hour = 0;
            minute = 0;
            second = 0;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute > 59){
            hour = 0;
            minute = 0;
            second = 0;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second > 59){
            hour = 0;
            minute = 0;
            second = 0;
        }
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void displayTime(){
        System.out.printf("%d : %d : %d",getHour(),getMinute(),getSecond());

    }
}
