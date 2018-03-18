package com.study.yang.android000_defineviewgroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.study.yang.android000_defineviewgroup.view.DefineViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DefineViewGroup dvg1 = (DefineViewGroup) findViewById(R.id.dvg_1);
        dvg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dvg1.setToggle(!dvg1.isToggle());
            }
        });
    }
}
