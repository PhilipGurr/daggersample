package com.philipgurr.daggersample.presenter;

import com.philipgurr.daggersample.model.RandomStringGenerator;
import com.philipgurr.daggersample.view.View;

public class MainPresenter {
    private static final String[] CHOICES = new String[] {"Dummy1", "Dummy2", "Dummy3"};

    View view;

    public void onChangeTextClick() {
        view.setRandomString(
                RandomStringGenerator.generateRandomString(CHOICES)
        );
    }
}
