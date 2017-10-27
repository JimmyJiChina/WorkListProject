package com.example.google.worklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import java.lang.CharSequence;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  ButtonClick(View view){
       // Button bu1 = (Button) findViewById(R.id.button1);
        //CharSequence str1 =  bu1.getText();
        Toast.makeText(getApplicationContext(), "This Work is To Be Done", Toast.LENGTH_SHORT).show();
    }
}
