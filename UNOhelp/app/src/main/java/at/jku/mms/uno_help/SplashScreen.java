package at.jku.mms.uno_help;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private static final int RC_PERMISSION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        boolean permissionsGranted;

        // Check if android version is higher than 23
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // Check if permissions have been granted
            if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                // Ask for permissions
                permissionsGranted = false;
                requestPermissions(new String[] {Manifest.permission.CAMERA}, RC_PERMISSION);
            } else {
                // Permissions where already granted
                permissionsGranted = true;
            }
        } else {
            // No need to ask for permissions explicit
            permissionsGranted = true;
        }

        if(permissionsGranted) {
            // Permissions got granted

            // Basically start a timer that executes this code block after 3000ms
            new Handler().postDelayed(() -> {
                // Start new Intent for switching to main Activity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                finish();
            }, 3000);
        }
    }
}