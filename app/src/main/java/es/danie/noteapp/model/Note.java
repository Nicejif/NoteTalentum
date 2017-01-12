package es.danie.noteapp.model;



public class Note {

    private String title;
    private String text;
    private long color;

    public Note(String title){
     this.title = title;
    }

    public long getColor() {
        return color;

    }

    public void setColor(long color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
