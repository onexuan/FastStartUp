package com.szagurskii.superfaststartup.main;

import android.support.annotation.NonNull;

import java.util.Random;
import java.util.concurrent.Callable;

import dagger.Module;
import dagger.Provides;
import rx.Observable;

@Module
public class MainModule {
  @Provides @NonNull @MainScope
  public Observable<MainLibrary> mainLibrary(final Random random) {
    return Observable.fromCallable(new Callable<MainLibrary>() {
      @Override public MainLibrary call() throws Exception {
        return new MainLibrary(random);
      }
    });
  }
}
