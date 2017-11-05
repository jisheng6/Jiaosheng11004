package com.example.adminjs.jiaosheng11004;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.adminjs.jiaosheng11004.view.CustomProgressView;

public class MainActivity extends Activity implements TitleView.MyCallBack{

   // private Button hui;
    private Button but;
    private CustomProgressView progres;
    private Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progres = (CustomProgressView) findViewById(R.id.custom);

      //  hui = (Button) findViewById(R.id.fan);
       Button but = (Button) findViewById(R.id.right_btn);
        butt = (Button) findViewById(R.id.butt);
      /*  hui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "返回按钮", Toast.LENGTH_SHORT).show();
            }
        });*/
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MactActivity.class);
                startActivity(intent);
            }
        });
        TitleView titleView = (TitleView) findViewById(R.id.titleview_id);
        titleView.setCallBack(this);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progres.start();
            }
        });

    }


    @Override
    public void leftClick() {
        Toast.makeText(this, "left", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void rightClick() {
        Toast.makeText(this, "right", Toast.LENGTH_SHORT).show();

    }
}
