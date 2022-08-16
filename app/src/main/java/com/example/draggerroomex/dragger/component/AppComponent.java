package com.example.draggerroomex.dragger.component;

import android.app.Application;

import com.example.draggerroomex.dragger.db.Databaseclient;
import com.example.draggerroomex.MainActivity;
import com.example.draggerroomex.dragger.db.dao;
import com.example.draggerroomex.dragger.module.AppModule;
import com.example.draggerroomex.dragger.Repositry.ProductRepositry;
import com.example.draggerroomex.dragger.module.RoomModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(dependencies= {},modules = {AppModule.class, RoomModule.class})
public interface AppComponent
{
    public void Inject (MainActivity mainActivity);
    public dao dao();
    public Databaseclient databasecleint();
    public  ProductRepositry productreposity();
    public Application application();
}
