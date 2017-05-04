package com.px.camera3d;

import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.px.camera3d.widge.roundImage.RoundedImageView;
import com.squareup.picasso.Picasso;


/**
 * 这是一个3d拍照的项目
 * 自己集成了opencv
 * 本想直接用ndk，时间紧就用sdk了
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    TextView tv = (TextView) findViewById(R.id.sample_text);
    tv.setText(stringFromJNI());
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));

    }

    public native String stringFromJNI();

    static {
        System.loadLibrary("native-lib");
    }
}
