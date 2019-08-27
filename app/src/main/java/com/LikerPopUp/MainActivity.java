package com.LikerPopUp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview=findViewById(R.id.imageview);
        PhotoViewAttacher photoViewAttacher=new PhotoViewAttacher(imageview);
        photoViewAttacher.update();
    }

    public void popupActivity(View view) {
        Intent intent = new Intent(this, PopupActivity.class);
        startActivity(intent);
    }
}
