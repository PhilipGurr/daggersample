package com.philipgurr.daggersample.dagger;

import com.philipgurr.daggersample.view.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ActivityModule {
    @ContributesAndroidInjector(modules = ViewModule.class)
    MainActivity contributeMainActivity();
}
