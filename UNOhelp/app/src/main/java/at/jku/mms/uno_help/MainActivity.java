package at.jku.mms.uno_help;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.budiyev.android.codescanner.ScanMode;
import com.google.zxing.Result;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CodeScanner codeScanner;
    private static final int RC_PERMISSION = 10;
    private boolean permissionsGranted;

    private static final Player player = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
            // Try to get CodeScannerView from activity_main
            CodeScannerView scannerView = findViewById(R.id.scanner_view);

            // Setup code scanner
            codeScanner = new CodeScanner(this, scannerView);

            // Keeps scanning after a code was found
            codeScanner.setScanMode(ScanMode.CONTINUOUS);

            // Set callback when a code was read/decoded
            codeScanner.setDecodeCallback(new DecodeCallback() {
                @Override
                public void onDecoded(@NonNull final Result result) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            // Set decoded text into TextView
                            TextView tv = findViewById(R.id.text_result);
                            tv.setText(result.getText());
                        }
                    });
                }
            });
        }
<<<<<<< Updated upstream
        player.setName(this);
=======

>>>>>>> Stashed changes
    }

    @Override
    protected void onResume() {
        super.onResume();
        codeScanner.startPreview();
    }

    @Override
    protected void onPause() {
        codeScanner.releaseResources();
        super.onPause();
    }


    public ArrayList<Card> getPossibleCards(Card currentTopCard){
        
    }
}