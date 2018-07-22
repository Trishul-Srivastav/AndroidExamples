package com.example.trishul.servicesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_start,btn_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start=findViewById(R.id.btn_start);
        btn_stop=findViewById(R.id.btn_Stop);

        btn_start.setOnClickListener(this);
        btn_stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start:
                Intent start=new Intent(getApplicationContext(),BackGroundWork.class);
                startService(start);

                break;
            case R.id.btn_Stop:
                    Intent stop=new Intent(getApplicationContext(),BackGroundWork.class);
                    stopService(stop);
                break;
        }
    }
}
