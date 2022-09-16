package com.example.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtInput;
    Spinner countOpt;
    TextView txtCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtInput = findViewById(R.id.txtInput);
        this.countOpt = findViewById(R.id.spinner);
        this.txtCount = findViewById(R.id.txtResult);
    }
}