package com.example.sp20_bse_076_assi_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Input, Cal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input = findViewById(R.id.Input);
        Cal = findViewById(R.id.Cal);

        Input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LeftFrag Lft=new LeftFrag();
                FragmentTransaction trans=getSupportFragmentManager().beginTransaction();
                trans.replace(R.id.myfield,Lft).commit();
                // g.setText("");
            }

        });




        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RightFrag Ryt=new RightFrag();
                FragmentTransaction trans2=getSupportFragmentManager().beginTransaction();
                trans2.replace(R.id.myfield,Ryt).commit();
                // g.setText("");
            }


        });





    }}