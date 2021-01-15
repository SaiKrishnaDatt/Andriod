package com.rsd.tribute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void saveAsFan(View view){
        EditText fanName = findViewById(R.id.personNameText);
        Log.i("Info","Party Time,One Fan with name: "+ fanName.getText().toString() );
        Toast.makeText(MainActivity.this,"Congratulations "+fanName.getText().toString()+", you are added to the club",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}