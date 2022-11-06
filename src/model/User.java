package model;

public class User {
    private int id;
    private String name;
    private String surname;
    private String nickname;
    private String profilePhotoUrl;
    private long created; // time
    private long lastLogged; // time
    private int permissions; // bitmap

    public User(int id, String name, String surname, String nickname, String profilePhotoUrl, long created, long lastLogged, int permissions) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.profilePhotoUrl = profilePhotoUrl;
        this.created = created;
        this.lastLogged = lastLogged;
        this.permissions = permissions;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public long getCreated() {
        return created;
    }

    public long getLastLogged() {
        return lastLogged;
    }

    public int getPermissions() {
        return permissions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public void setLastLogged(long lastLogged) {
        this.lastLogged = lastLogged;
    }

}
