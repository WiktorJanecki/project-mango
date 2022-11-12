package pl.slowacki.projectmango.model;

import java.util.Objects;

public class Comment {
    private int id;
    private int userID;
    private int replyID; // if comment is a reply id != -1
    private String content;
    private long date;

    public Comment() {
    }

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

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getReplyID() {
        return replyID;
    }

    public void setReplyID(int replyID) {
        this.replyID = replyID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return id == comment.id && userID == comment.userID && replyID == comment.replyID && date == comment.date && Objects.equals(content, comment.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userID, replyID, content, date);
    }
}
