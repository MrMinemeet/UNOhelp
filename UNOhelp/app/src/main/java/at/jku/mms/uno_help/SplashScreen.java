package at.jku.mms.uno_help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Basically start a timer that executes this code block after 3000ms
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start new Intent for switching to main Activity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        }, 3000);
    }
}