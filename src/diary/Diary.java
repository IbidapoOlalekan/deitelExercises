package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String ownerName;
    private ArrayList<Gists> gists = new ArrayList<>();
    private ArrayList<Gists>favoriteGists = new ArrayList<>();
    private String password;
    public ArrayList<Gists> getFavoriteGists() {
        return favoriteGists;
    }

    public void setFavoriteGists(ArrayList<Gists> favoriteGists) {
        this.favoriteGists = favoriteGists;
    }



    public Diary(String name, String secretKey){
        ownerName = name;
        password = secretKey;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<Gists> getGists() {
        return gists;
    }

    public void setGists(ArrayList<Gists> gists) {
        this.gists = gists;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public  String getPassword() {
        return password;
    }

    public void addNewGist(String title, String gistProper, String secretKey){
        if (secretKey.equals(password)){
            Gists gist = new Gists(title, gistProper);
            gists.add(gist);
        }
        else{
            throw new IllegalArgumentException("Ya Password is wrong my dia");
        }
    }



    public Gists findGistByTitle(String gistTitle) {
        for(Gists gist : gists){
            if(gist.getTitle().equalsIgnoreCase(gistTitle))return gist;
        }
        throw new IllegalArgumentException("Gist not found");
    }


    public void deleteGist(String gistTitle, String password) {
        if (password.equals(password)){
            for (Gists gist : gists){
                if(gist.getTitle().equalsIgnoreCase(gistTitle)){
                    gists.remove(gist);
                }else{
                    throw new IllegalArgumentException("Gist not found");
                }
            }
        }
    }

    public void favorite(String gistTitle) {
        for(Gists gist: gists){
            if(gist.getTitle().equalsIgnoreCase(gistTitle)){
                favoriteGists.add(gist);
                break;
            }
            throw new IllegalArgumentException("Gist Not Found");
        }
    }
}
