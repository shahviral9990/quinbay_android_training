package com.example.androidtraining.glide;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.androidtraining.R;

import androidx.appcompat.app.AppCompatActivity;

public class GlideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        ImageView imageView = findViewById(R.id.iv_image);
        ImageView gifImage = findViewById(R.id.iv_gif);
        Glide.with(this)
                .load("https://images.livemint.com/rf/Image-621x414/LiveMint/Period2/2017/04/06/Photos/Processed/munnar2-krXG--621x414@LiveMint.jpg")
                .placeholder(R.drawable.placeholder)
                .into(imageView);
        Glide.with(this).asGif()
                .load("https://4.bp.blogspot.com/-uhjF2kC3tFc/U_r3myvwzHI/AAAAAAAACiw/tPQ2XOXFYKY/s1600/Circles-3.gif")
                .into(gifImage);

    }
}