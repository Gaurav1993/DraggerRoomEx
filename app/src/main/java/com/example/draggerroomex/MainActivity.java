package com.example.draggerroomex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.draggerroomex.dragger.Repositry.ProductRepositry;
import com.example.draggerroomex.dragger.db.Entity;
import com.example.draggerroomex.dragger.module.RoomModule;

import java.util.Base64;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    ProductRepositry productRepositry;
    Button bt_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_click=findViewById(R.id.bt_click );
        ((BaseApplication)getApplication()).getAppComponent().Inject(this);



        Entity entity=new Entity();
        entity.setTitle("Test");
        entity.setMessage("12-10-2022");
        productRepositry.insert(entity);

        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Data= String.valueOf(productRepositry.getNote().get(1).getMessage());
                Log.d("Message_Get",Data.toString());
            }
        });


    }
}