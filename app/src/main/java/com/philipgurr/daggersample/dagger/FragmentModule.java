package com.philipgurr.daggersample.dagger;

import com.philipgurr.daggersample.view.SampleFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {
    @ContributesAndroidInjector(modules = ViewModule.class)
    abstract SampleFragment contributeSampleFragment();
}
