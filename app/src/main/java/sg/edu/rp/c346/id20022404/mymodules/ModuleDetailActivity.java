package sg.edu.rp.c346.id20022404.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        Log.d("ModuleDetailActivity", "onCreate() called.");

        tvDisplay = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        String detail = intentReceived.getStringExtra("detail");
        tvDisplay.setText(detail);

    }
}