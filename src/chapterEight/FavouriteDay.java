package chapterEight;

import java.time.LocalDate;

public enum FavouriteDay {
    HBD("Birthday","Lokoja",LocalDate.of(2015,3,30)),
    DD("Kick Bucket Day","While i die",LocalDate.of(8033,1,1)),
    WD("Wedding Day","Shrine",LocalDate.of(8032,1,1)),
    LD("Lenny's Death","Where she dies",LocalDate.of(8033,1,2))

    ;


    private final String name;
    private final String placeOfOccurence;
    private final LocalDate date;

    FavouriteDay(String name, String place, LocalDate date){
        this.name = name;
        placeOfOccurence = place;
        this.date = date;
    }


    public String getName(){
        return name;
    }

    public String getPlaceOfOccurence(){
        return placeOfOccurence;
    }
    public LocalDate getDate(){
        return date;
    }


}
