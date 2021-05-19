package sg.edu.rp.c346.id20022404.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView module1, module2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() called.");

        module1 = findViewById(R.id.textView);

        module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("detail", "Module Code: C346\nModule Name: Android Programming\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
                startActivity(intent);
            }
        });

        module2 = findViewById(R.id.textView2);

        module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("detail", "Module Code: C349\nModule Name: iPad Programming\nAcademic Year: 2020\nSemester: 2\nModule Credit: 4\nVenue: W64M");
                startActivity(intent);
            }
        });
    }

}