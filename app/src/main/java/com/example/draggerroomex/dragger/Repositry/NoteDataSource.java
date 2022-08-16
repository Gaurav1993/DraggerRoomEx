package com.example.draggerroomex.dragger.Repositry;

import com.example.draggerroomex.dragger.db.Entity;
import com.example.draggerroomex.dragger.db.dao;

import java.util.List;

import javax.inject.Inject;


public class NoteDataSource implements ProductRepositry
{
    dao mdao;

    @Inject
    public NoteDataSource(dao mdao)
    {
        this.mdao=mdao;
    }

    @Override
    public void insert(Entity entity) {
        mdao.insert(entity);
    }

    @Override
    public void update(Entity entity) {

    }

    @Override
    public void delete(Entity entity) {

    }

    @Override
    public List<Entity> getNote() {
        return mdao.getNote();
    }



}
