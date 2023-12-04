package interface_adapter.match;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MatchState {

    public List<String> matched_users = new ArrayList<>();

    private String user_id = "";
    private String matchError = null;

    public MatchState(MatchState copy) {
        user_id = copy.user_id;
        matchError = copy.matchError;
    }

    public MatchState() {
    }
//getters
    public List<String> getMatched_users(){
        return matched_users;
    }

    public String getUser_id(){
        return user_id;
    }

    public String getMatchError(){
        return matchError;
    }

//setters
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    public void setMatched_users(List<String> matched_users){
        this.matched_users = matched_users;
    }

    public void setMatchError(String error){
        this.matchError = error;
    }

}
