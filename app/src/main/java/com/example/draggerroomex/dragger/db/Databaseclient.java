package com.example.draggerroomex.dragger.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Entity.class},version = 1,exportSchema = false)
public abstract class Databaseclient extends RoomDatabase
{
    public abstract dao getnotedao();
}
