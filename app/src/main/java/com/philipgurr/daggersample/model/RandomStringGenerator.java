package com.philipgurr.daggersample.model;
import android.util.Log;

import java.util.concurrent.ThreadLocalRandom;

import javax.inject.Inject;

public class RandomStringGenerator {
    private final String[] choices;

    @Inject
    public RandomStringGenerator(String[] choices) {
        this.choices = choices;
    }

    public String generateRandomString() {
        Log.d("phipo00", "generateRandomString: called");
        return choices[ThreadLocalRandom.current().nextInt(0, choices.length)];
    }
}
