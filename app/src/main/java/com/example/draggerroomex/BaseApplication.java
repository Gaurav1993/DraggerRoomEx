package com.example.draggerroomex;

import android.app.Application;

import com.example.draggerroomex.dragger.component.AppComponent;
import com.example.draggerroomex.dragger.component.DaggerAppComponent;
import com.example.draggerroomex.dragger.module.AppModule;
import com.example.draggerroomex.dragger.module.RoomModule;

public class BaseApplication extends Application
{

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .roomModule(new RoomModule(this))
                .build();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
