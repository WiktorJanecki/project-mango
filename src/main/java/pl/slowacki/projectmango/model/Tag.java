package pl.slowacki.projectmango.model;

import java.util.Objects;

public class Tag {
    private int id;
    private String content;
    private short priority; // from 1 to 6 (h1-h6)

    public Tag(int id, String content, short priority) {
        this.id = id;
        this.content = content;
        this.priority = priority;
    }

    public Tag() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return id == tag.id && priority == tag.priority && Objects.equals(content, tag.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, priority);
    }
}
