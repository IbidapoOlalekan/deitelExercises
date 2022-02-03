package chapterThree;

import java.security.PublicKey;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        if (hour > 23 || hour < 0){
            throw new IllegalArgumentException("Hour must be 0 - 23");

        }
        this.hour = hour;

        if (minute < 0 ||minute >= 59){
           throw new IllegalArgumentException("Minute must be 0 - 59");
        }
        this.minute = minute;

        if (second < 0 ||second > 59){
           throw  new IllegalArgumentException("Seconds must be 0 - 59");
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

        if (hour < 10){

            return hour;
        }

        return hour;
    }


    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void displayTime(){
        System.out.printf("%02d : %02d : %02d",getHour(),getMinute(),getSecond());

    }
}
