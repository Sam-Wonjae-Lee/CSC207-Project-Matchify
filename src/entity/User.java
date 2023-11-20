package entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String photo;

    private String name;

    private int age;

    private String bio;

    // Includes Friend and CloseFriend class
    // Test if there are errors with adding CloseFriend to friends array
    private List<Friend> friends;

    private List<CloseFriend> closeFriends;

    private Playlist spotifyPlaylist;

    private Invite invites;

    private List<String> inbox;

    public void changePhoto() {}

    public void changeBio() {}

    public void changePlaylist() {}

    // Two constructors needed for creating the User and for user id.
    public User(String photo, String name, int age, String bio, Playlist spotifyPlaylist) {
        this.photo = photo;
        this.age = age;
        this.bio = bio;
        this.name = name;
        this.spotifyPlaylist = spotifyPlaylist;
        this.friends = new ArrayList<>();
        this.closeFriends = new ArrayList<>();
    }

    public void ChangePhoto(String new_photo) {
        this.photo = new_photo;
    }

    public void ChangeBio(String new_bio) {
        this.bio = new_bio;
    }

    public void ChangePlaylist(Playlist new_playlist) {
        this.spotifyPlaylist = new_playlist;
    }

    public List<String> getInbox(){
        return inbox;
    }

    public void MadeNewFriend(int userID, String name) {
        Friend friend = new Friend(userID, name);
        friends.add(friend);
    }

    public String getName() {return this.name;}
//
//    public User() {}

}
