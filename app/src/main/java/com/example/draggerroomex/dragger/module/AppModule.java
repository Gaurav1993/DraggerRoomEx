package com.example.draggerroomex.dragger.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule
{
    Application application;

          public AppModule(Application application)
          {
              this.application=application;
          }

          @Singleton
          @Provides
          Application getappplication()
          {
              return application;
          }

}
