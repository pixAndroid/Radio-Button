package com.example.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

/*1800 2582 000*/
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedButtonId) {
                switch (checkedButtonId) {
                    case R.id.rb_option_a:
                        Toast.makeText(MainActivity.this, "Option A is selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_option_b:
                        Toast.makeText(MainActivity.this, "Option B is selected", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        //radioGroup.check(R.id.rb_option_a);
        radioGroup.clearCheck();
        radioGroup.getCheckedRadioButtonId();
    }

}