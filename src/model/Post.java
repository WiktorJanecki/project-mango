package model;

public class Post {
    private int id;
    private String title;
    private long date;
    private String content;

    public Post(int id, String title, long date, String content) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public long getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
