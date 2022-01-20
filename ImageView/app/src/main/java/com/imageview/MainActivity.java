package com.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);
        imageView5=findViewById(R.id.imageView5);
        imageView6=findViewById(R.id.imageView6);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Photo 1", Toast.LENGTH_SHORT).show();

            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Photo 2", Toast.LENGTH_SHORT).show();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Photo 3", Toast.LENGTH_SHORT).show();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Photo 4", Toast.LENGTH_SHORT).show();
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Photo 5", Toast.LENGTH_SHORT).show();
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Photo 6", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView:
                Toast.makeText(MainActivity.this, "photo ONE", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,infoDitels.class);
                intent.putExtra("Photo1","Footbl");
                startActivity(intent);
                break;
            case R.id.imageView2:
                Toast.makeText(MainActivity.this, "Photo Tow", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView3:
                Toast.makeText(MainActivity.this, "Photo There", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView4:
                Toast.makeText(MainActivity.this, "Photo Fuor", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView5:
                Toast.makeText(MainActivity.this, "Photo Fiv", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView6:
                Toast.makeText(MainActivity.this, "Photo Six", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}