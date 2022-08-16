package com.example.draggerroomex.dragger.db;


import androidx.room.PrimaryKey;

@androidx.room.Entity
public class Entity
{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PrimaryKey (autoGenerate = true)
    int id;
    String title;
    String message;
}
