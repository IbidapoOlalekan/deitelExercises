package diary;

import java.time.LocalDateTime;

public class Gist {
    private String title;
    private LocalDateTime time = LocalDateTime.now();
    private String gist;

    public Gist(String entryTitle, String gossipProper){
        title = entryTitle;
        gist = gossipProper;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist;
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("Gist{");
      sb.append("title=' ").append(title).append('\'');
      sb.append(", time=").append(time);
      sb.append(", gist=").append(gist).append('\'');
      sb.append('}');
      return sb.toString();
    }

}
