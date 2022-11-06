package model;

public class Comment {
    private int id;
    private int userID;
    private int replyID; // if comment is a reply id != -1
    private String content;
    private long date;

    public Comment(int id, int userID, int replyID, String content, long date) {
        this.id = id;
        this.userID = userID;
        this.replyID = replyID;
        this.content = content;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getUserID() {
        return userID;
    }

    public int getReplyID() {
        return replyID;
    }

    public String getContent() {
        return content;
    }

    public long getDate() {
        return date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
