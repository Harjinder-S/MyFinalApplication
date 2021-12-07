package algonquin.cst2335.myfinalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button covid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        covid = findViewById(R.id.covid);
        // calling click listener on button to go to second activity
        covid.setOnClickListener(click ->{
        Intent nextPage = new Intent(MainActivity.this,MainActivity2.class);
            Toast.makeText(MainActivity.this, "Covid 19 tracker is opening"
                    , Toast.LENGTH_LONG).show();
        startActivity(nextPage);

        });
    }
}