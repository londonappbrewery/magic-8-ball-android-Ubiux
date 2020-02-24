package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final private static String TAG = "Ballz";
    boolean isFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v2);
        Button ballButton = findViewById(R.id.btn_ball);
        final ImageView ballPicture = findViewById(R.id.img_ball);
        final int[] images = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        //final boolean isFirst = true;

        ballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Ze button has been pressed");
                int number = new Random().nextInt(5);
                if (isFirst){
                    while (number == 0){
                        number = new Random().nextInt(5);
                    }
                    isFirst = false;
                }
                ballPicture.setImageResource(images[number]);
            }
        });
    }
}
