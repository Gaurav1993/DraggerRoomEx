package com.example.draggerroomex.dragger.Repositry;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.draggerroomex.dragger.db.Entity;

import java.util.List;

public interface ProductRepositry {

    @Insert
    void insert(Entity entity);

    @Update
    void update(Entity entity);

    @Delete
    void delete(Entity entity);

    @Query("SELECT * from entity")
    List<Entity> getNote() ;
}
