package com.example.halflifed20;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView one;
    private TextView two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        one = (TextView) findViewById(R.id.textView);
        two = (TextView) findViewById(R.id.textView2);

        one.setText(R.string.empty);
        //two.setText(R.string.empty);

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                one.setText(R.string.miss);
                //two.setText(R.string.miss);
                MediaPlayer mediaPlayer= MediaPlayer.create(MainActivity.this,R.raw.casualties);
                        mediaPlayer.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                MediaPlayer mediaPlayer2= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer2.start();
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                MediaPlayer mediaPlayer3 = MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer3.start();
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                MediaPlayer mediaPlayer4= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer4.start();
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                MediaPlayer mediaPlayer5= MediaPlayer.create(MainActivity.this,R.raw.five);
                        mediaPlayer5.start();
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                MediaPlayer mediaPlayer6= MediaPlayer.create(MainActivity.this,R.raw.six);
                        mediaPlayer6.start();
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                MediaPlayer mediaPlayer7= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer7.start();
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                MediaPlayer mediaPlayer8= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer8.start();
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                MediaPlayer mediaPlayer9= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer9.start();
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                MediaPlayer mediaPlayer10= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer10.start();
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                MediaPlayer mediaPlayer11= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer11.start();
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                MediaPlayer mediaPlayer12= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer12.start();
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                MediaPlayer mediaPlayer13= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer13.start();
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                MediaPlayer mediaPlayer14= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer14.start();
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                MediaPlayer mediaPlayer15= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer15.start();
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                MediaPlayer mediaPlayer16= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer16.start();
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                MediaPlayer mediaPlayer17= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer17.start();
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                MediaPlayer mediaPlayer18= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer18.start();
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                MediaPlayer mediaPlayer19= MediaPlayer.create(MainActivity.this,R.raw.delta);
                        mediaPlayer19.start();
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                one.setText(R.string.hit);
                //two.setText(R.string.hit);
                MediaPlayer mediaPlayer20= MediaPlayer.create(MainActivity.this,R.raw.yeah);
                        mediaPlayer20.start();
                break;

        }
    }
}