package com.philipgurr.daggersample.presenter;

import com.philipgurr.daggersample.model.RandomStringGenerator;
import com.philipgurr.daggersample.view.MainView;

import javax.inject.Inject;

public class MainPresenter {
    private MainView mainView;
    private RandomStringGenerator model;

    @Inject
    public MainPresenter(MainView mainView, RandomStringGenerator model) {
        this.mainView = mainView;
        this.model = model;
    }

    public void onChangeTextClick() {
        mainView.setRandomString(
                model.generateRandomString()
        );
    }
}
