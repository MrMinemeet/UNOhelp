package at.jku.mms.uno_help;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.ScanMode;

public class MainActivity extends AppCompatActivity {

    private CodeScanner codeScanner;

    private static final Player player = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create pop-up for name input
        player.setName(this);

        // Try to get CodeScannerView from activity_main
        CodeScannerView scannerView = findViewById(R.id.scanner_view);

        // Setup code scanner
        codeScanner = new CodeScanner(this, scannerView);

        // Keeps scanning after a code was found
        codeScanner.setScanMode(ScanMode.CONTINUOUS);

        // Set callback when a code was read/decoded
        codeScanner.setDecodeCallback(result -> runOnUiThread(new Runnable() {
            @Override
            public void run() {
                // Set decoded text into TextView
                TextView tv = findViewById(R.id.text_result);
                tv.setText(result.getText());
            }
        }));
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
}