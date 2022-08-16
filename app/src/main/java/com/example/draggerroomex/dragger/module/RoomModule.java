package com.example.draggerroomex.dragger.module;

import android.app.Application;

import androidx.room.Room;

import com.example.draggerroomex.dragger.db.Databaseclient;
import com.example.draggerroomex.dragger.db.dao;
import com.example.draggerroomex.dragger.Repositry.NoteDataSource;
import com.example.draggerroomex.dragger.Repositry.ProductRepositry;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RoomModule {

    Databaseclient databaseclient;

    public RoomModule(Application application) {
        databaseclient = Room.databaseBuilder(application, Databaseclient.class, "note").allowMainThreadQueries().build();
    }

    @Singleton
    @Provides
    public Databaseclient getDatabaseclient() {
        return databaseclient;
    }

    @Singleton
    @Provides
    dao provideproductdao(Databaseclient databaseclient) {
        return databaseclient.getnotedao();
    }

    @Singleton
    @Provides
    ProductRepositry productRepositry(dao dao)
    {
        return new NoteDataSource(dao);
    }
}
