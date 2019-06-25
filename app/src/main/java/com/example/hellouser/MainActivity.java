package com.example.hellouser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void doSomething(View v){
        TextView outputText = (TextView) findViewById(R.id.textView);
        EditText nameText = (EditText) findViewById(R.id.editText);


        outputText.setText("Hello, " + nameText.getText());

    }
}
