package model;

public class Tag {
    private int id;
    private String content;
    private short priority; // from 1 to 6 (h1-h6)

    public Tag(int id, String content, short priority) {
        this.id = id;
        this.content = content;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public short getPriority() {
        return priority;
    }

    public void setPriority(short priority) {
        this.priority = priority;
    }
}
