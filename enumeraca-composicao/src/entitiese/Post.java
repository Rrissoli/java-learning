package entitiese;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Coments> coments = new ArrayList<>();
    
    public Post(Date moment, String title, String content) {
        this.moment = moment;
        this.title = title;
        this.content = content;
    }

    public Post() {
    }
    public Date getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Coments> getComents(){
    return coments;
    } 
    public void setContent(String content) {
        this.content = content;
    }
    public void addComent (Coments comentary){
        this.coments.add(comentary);
    }
    public void removeComent (Coments comentary){
        this.coments.remove(comentary);
    }
    public void addLike (){
        this.likes += 1;
    }
    @Override
    public String toString() {
        return "Post [moment=" + moment + ", title=" + title + ", content=" + content + ", likes=" + likes + "]";
    }


    
    



    
}
