package com.example.adminjs.jiaosheng11004;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Adminjs on 2017/11/4.
 */
public class MactActivity extends AppCompatActivity{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_mate);

        button = (Button)findViewById(R.id.left_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MactActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
