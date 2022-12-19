package com.example.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import Classes.CountChar;

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
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.countOpt.setAdapter(adapter);
    }

    public void btnClick(View view) {
        if (txtInput.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Laukelis tuscias", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(this.countOpt.getSelectedItemPosition() == 1) {
                this.txtCount.setText(String.valueOf(CountChar.getCharLength(this.txtInput.getText().toString())));
            }
            else if(this.countOpt.getSelectedItemPosition() == 0) {
                this.txtCount.setText(String.valueOf(CountChar.getWordCount(this.txtInput.getText().toString())));
            }
       }

    }
}