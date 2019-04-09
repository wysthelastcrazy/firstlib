package com.wys.firstlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.wys.haha.WysUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=findViewById(R.id.tv_show);
        WysUtils utils=new WysUtils();
        tv.setText(utils.stringFromJNI());

        ImageView img=findViewById(R.id.img_show);
    }
}
