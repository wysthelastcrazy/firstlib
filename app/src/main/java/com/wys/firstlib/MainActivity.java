package com.wys.firstlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wys.haha.StrUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=findViewById(R.id.tv_show);
        StrUtils utils=new StrUtils();
        tv.setText(utils.stringFromJNI());
    }
}
