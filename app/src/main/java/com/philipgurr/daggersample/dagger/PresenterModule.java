package com.philipgurr.daggersample.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    @Provides
    public static String[] provideChoices() {
        return new String[] {"Dummy1", "Dummy2", "Dummy3"};
    }
}
