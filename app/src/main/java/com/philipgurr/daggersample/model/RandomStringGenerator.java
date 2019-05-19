package com.philipgurr.daggersample.model;
import java.util.concurrent.ThreadLocalRandom;

public class RandomStringGenerator {
    public static String generateRandomString(String[] choices) {
        return choices[ThreadLocalRandom.current().nextInt(0, choices.length)];
    }
}
