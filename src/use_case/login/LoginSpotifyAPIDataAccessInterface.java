package use_case.login;

import entity.User;

public interface LoginSpotifyAPIDataAccessInterface {
    boolean userExists(String userId);

    // If user doesn't exist in csv file, we save it.
    // Otherwise, we don't
    String getName(String userID);

    String getProfilePicture(String userID);

}