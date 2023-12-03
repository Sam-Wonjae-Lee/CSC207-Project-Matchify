package interface_adapter.match;

import entity.User;
import interface_adapter.ViewManagerModel;
import interface_adapter.ViewModel;
import use_case.match.MatchOutPutData;
import use_case.match.MatchOutputBoundary;

import java.util.ArrayList;

public class MatchPresenter implements MatchOutputBoundary {
    private final MatchViewModel matchViewModel;
    private ViewManagerModel viewManagerModel;
    public MatchPresenter(MatchViewModel matchViewModel, ViewManagerModel viewManagerModel) {
        this.matchViewModel = matchViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView(MatchOutPutData userList) {
        MatchState matchState = matchViewModel.getState();
        matchState.setMATCHED_USERS(userList.getuserArrayList());
        matchState.setMATCHED_USERSNAMES(userList.getUserNames());
        matchState.setCLIENT_USERID(userList.getClientUser().getUserID());
        this.matchViewModel.setState(matchState);
        matchViewModel.firePropertyChanged();
        this.viewManagerModel.setActiveView(matchViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        MatchState matchState = matchViewModel.getState();
        matchState.setMATCHED_USERS_ERROR(error);
        matchViewModel.firePropertyChanged();
    }
}
