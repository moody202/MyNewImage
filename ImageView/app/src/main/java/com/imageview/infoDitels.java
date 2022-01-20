package com.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class infoDitels extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_ditels);
        imageView=findViewById(R.id.imageView7);
        textView1=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);

        Bundle bundle=getIntent().getExtras();
        if(bundle != null){
            String name=bundle.getString("Photo1");

        }

    }
}