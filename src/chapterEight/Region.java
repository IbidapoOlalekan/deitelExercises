package chapterEight;

public enum Region {
    NN("Ikeja","Oshogbo","Yaba"),
    SS("Maryland","VI","BI"),
    EE("Sango","Bariga","Makoko","Mushin"),
    WW("Ikorodu","Badagry","Epe"),
    SE("Lagos","Owerri");


    private final String[] states;
    Region(String...states){
        this.states = states;
        System.out.println("I was called");
    }
    public String[] getState(){
        return states;
    }
}
