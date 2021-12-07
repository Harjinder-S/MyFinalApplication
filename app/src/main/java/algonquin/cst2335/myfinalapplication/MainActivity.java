package algonquin.cst2335.myfinalapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.owlbot);
        btn.setOnClickListener(clk -> {

            Intent nextPage = new Intent(MainActivity.this, SecondActivity.class);

            startActivity(nextPage);
        });

    }

}