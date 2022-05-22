package com.webserva.wings.android.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListViewオブジェクトの取得
        ListView lvPurpose = findViewById(R.id.lvPurpose);
        List<String> purposeList = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, purposeList);
        ///設定ボタンの取得
        Button inputBtn = findViewById(R.id.btCreate);
        inputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //要素追加
                EditText purpose = findViewById(R.id.etPurposeForm);
                //EditText(テキスト)を取得し、アダプタに追加
                purposeList.add(purpose.getText().toString());
            }
        });
        lvPurpose.setAdapter(adapter);
    }

}
