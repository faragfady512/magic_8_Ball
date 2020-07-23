package com.example.magic_8_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton;
        addButton = findViewById(R.id.addbutton);
      final   ImageView ball;
        ball = findViewById(R.id.ballimageView);
        final int ballArray[] = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4,R.drawable.ball5};

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomgenrater = new Random();
                int randomNumber = randomgenrater.nextInt(4);
                ball.setImageResource(ballArray[randomNumber]);


            }
        });
    }
}
