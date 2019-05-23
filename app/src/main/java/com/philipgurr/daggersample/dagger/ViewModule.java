package com.philipgurr.daggersample.dagger;

import com.philipgurr.daggersample.view.MainActivity;
import com.philipgurr.daggersample.view.MainView;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModule {
    @Binds
    abstract MainView provideView(MainActivity mainActivity);
}
