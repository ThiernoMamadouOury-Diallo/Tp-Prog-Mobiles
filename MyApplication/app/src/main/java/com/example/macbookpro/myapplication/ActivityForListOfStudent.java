package com.example.macbookpro.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityForListOfStudent extends AppCompatActivity {

    private static final int ADD_DETAIL_RESULT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_list_of_student);
    }

    public void getDetailForStudent(View view) {
        Intent intent = new Intent(ActivityForListOfStudent.this, DetailStudentActivity.class);
        startActivityForResult(intent, ADD_DETAIL_RESULT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("ActivityListOfStudent", requestCode + " - " + resultCode + " - " +data);
    }
}
