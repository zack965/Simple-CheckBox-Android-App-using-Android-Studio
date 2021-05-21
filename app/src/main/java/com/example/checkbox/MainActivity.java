package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private CheckBox checkbx;
    private TextView textview;
    private TextView checkdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        checkbx = (CheckBox)findViewById(R.id.checkbx);
        textview = (TextView)findViewById(R.id.textview);
        checkdata = (TextView)findViewById(R.id.checkdata);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test();
            }
        });
    }

    private void Test() {
        if(checkbx.isChecked()){
            textview.setText("checked");
            checkdata.setText(checkbx.getText().toString());
        }else{
            textview.setText("not checked");
            checkdata.setText(checkbx.getText().toString());
        }
    }
}