package com.example.kiit.quizzone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;

public class ScrollingActivity extends AppCompatActivity {
    Button b;
    RadioButton r1,r2;
    CheckBox c1,c2;
    Intent i;
    Switch s1,s2;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        b=(Button)findViewById(R.id.submit);
        r1=(RadioButton)findViewById(R.id.option2);
        r2=(RadioButton)findViewById(R.id.option7);
        c1=(CheckBox)findViewById(R.id.ch7);
        c2=(CheckBox)findViewById(R.id.ch3);
        s1=(Switch)findViewById(R.id.switch1);
        s2=(Switch)findViewById(R.id.switch4);
        i=getIntent();
        if(r1.isChecked())
            score=score+10;
        if(r2.isChecked())
            score=score+10;
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    score=score+10;

            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    score=score+10;
            }
        });
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    score=score+10;
            }
        });
        s2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    score=score+10;
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
