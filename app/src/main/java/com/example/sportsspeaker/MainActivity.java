package com.example.sportsspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgBoxing, imgKickBoxing, imgJudo, imgAikido, imgKarate, imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAikido = findViewById(R.id.imgAikido);
        imgBoxing = findViewById(R.id.imgBoxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgKickBoxing = findViewById(R.id.imgKickBoxing);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);


        imgBoxing.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);
        imgKickBoxing.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View ImageButtonView) {

        switch(ImageButtonView.getId()){

            case R.id.imgAikido:
                playSportsName(imgAikido.getTag().toString());
                Toast.makeText(this, "Aikido", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imgBoxing:
                playSportsName(imgBoxing.getTag().toString());
                break;

            case R.id.imgJudo:
                playSportsName(imgJudo.getTag().toString());
                break;

            case R.id.imgKarate:
                playSportsName(imgKarate.getTag().toString());
                break;

            case R.id.imgKickBoxing:
                playSportsName(imgKickBoxing.getTag().toString());
                break;

            case R.id.imgTaekwondo:
                playSportsName(imgTaekwondo.getTag().toString());
                break;

        }

    }

    public void playSportsName( String sportName){

        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(sportName, "raw", getPackageName()));
        mediaPlayer.start();

    }

}
