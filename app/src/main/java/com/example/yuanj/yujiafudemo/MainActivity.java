package com.example.yuanj.yujiafudemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("square","121212");


//                Toast.makeText(MainActivity.this,"弹出Toast",Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);

                startActivity(i);
            }
        });

        String[] strs={};
        for (String str:strs) {
            Log.i("sq",str);
        }

        for (int i=0;i<strs.length;i++){

        }

    }
}
