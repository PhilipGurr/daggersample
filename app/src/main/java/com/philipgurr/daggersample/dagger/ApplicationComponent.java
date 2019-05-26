package com.philipgurr.daggersample.dagger;

import com.philipgurr.daggersample.App;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityModule.class,
        FragmentModule.class,
        ViewModule.class,
        PresenterModule.class})
public interface ApplicationComponent extends AndroidInjector<App> {
    @Component.Factory
    interface ApplicationFactory extends AndroidInjector.Factory<App> {
        ApplicationComponent create(@BindsInstance App app);
    }
}
