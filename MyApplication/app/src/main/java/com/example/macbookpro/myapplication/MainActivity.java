package com.example.macbookpro.myapplication;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int ADD_ETUDIANT_RESULT = 05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void createNewStudent(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityForNewStudent.class);
                startActivityForResult(intent, ADD_ETUDIANT_RESULT);
    }

    public void getlistStudent(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityForListOfStudent.class);
        startActivityForResult(intent, ADD_ETUDIANT_RESULT);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("MainActivity", requestCode + " - " + resultCode + " - " +data);
    }



}
