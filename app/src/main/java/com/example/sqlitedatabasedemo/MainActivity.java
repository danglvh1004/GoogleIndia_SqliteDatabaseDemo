package com.example.sqlitedatabasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name, college;
    MyCoreDatabase myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        myData = new MyCoreDatabase(this);
    }

    private void initView() {
        name = findViewById(R.id.edit1);
        college = findViewById(R.id.edit2);
    }

    public void doSave(View view) {
        myData.insertData(name.getText().toString(), college.getText().toString());
    }

    public void doLoad(View view) {
        myData.getAll();
    }
}