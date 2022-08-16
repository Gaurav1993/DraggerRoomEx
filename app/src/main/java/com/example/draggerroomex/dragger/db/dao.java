package com.example.draggerroomex.dragger.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface dao
{
    @Insert
    void insert(Entity entity);

    @Update
    void update(Entity entity);

    @Delete
    void delete(Entity entity);

    @Query("SELECT * from entity")
    List<Entity> getNote() ;

}
