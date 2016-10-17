package com.example.lzl.testhello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Switch;


public class testHello extends Activity {

    private Button login_Button;
    private Switch Switch1;
    private boolean flag=false;
    private AutoCompleteTextView acTextView;
    private String[] strs={"Beijing1","shanghai1","beijing2","shanghai2","Japan"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_hello);
        login_Button=(Button) findViewById(R.id.button1);
        Switch1=(Switch) findViewById(R.id.switch1);
        acTextView=(AutoCompleteTextView)findViewById(R.id.textView2);
        login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switch1.setChecked(flag);
                flag=!flag;
            }
        });
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,strs);
        acTextView.setAdapter(adapter);
    }
}
