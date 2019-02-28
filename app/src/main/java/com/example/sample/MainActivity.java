package com.example.sample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rellay1;
    private ImageButton teacher ;
    private ImageButton student;
    Handler handler = new Handler();
    Runnable run = new Runnable() {
        @Override
        public void run() {
           rellay1.setVisibility(View.VISIBLE);

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*teacher Login*/
        teacher = (ImageButton) findViewById(R.id.teacher);
        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teacher = new Intent(MainActivity.this,te_login_page.class);
                startActivity(teacher);
            }
        });
        /*end Teacher Login*/

        /*Student login*/

        student = (ImageButton) findViewById(R.id.student);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent student = new Intent(MainActivity.this,login_page.class);
                startActivity(student);
            }
        });
        /*Student loin end*/

        rellay1 =(RelativeLayout) findViewById(R.id.rellay1);

        handler.postDelayed(run, 5000);
    }

}
