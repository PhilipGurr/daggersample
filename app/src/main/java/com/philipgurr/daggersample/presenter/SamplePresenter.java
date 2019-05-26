package com.philipgurr.daggersample.presenter;

import com.philipgurr.daggersample.model.RandomStringGenerator;
import com.philipgurr.daggersample.view.SampleView;

import javax.inject.Inject;

public class SamplePresenter {
    private SampleView sampleView;
    private RandomStringGenerator model;

    @Inject
    public SamplePresenter(SampleView sampleView, RandomStringGenerator model) {
        this.sampleView = sampleView;
        this.model = model;
    }

    public void onResume() {
        sampleView.setRandomStringSample(
                model.generateRandomString()
        );
    }
}
