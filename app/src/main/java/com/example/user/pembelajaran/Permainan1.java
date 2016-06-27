package com.example.user.pembelajaran;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Permainan1 extends AppCompatActivity {
    View vl1,vl2,vl3,vl4;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan1);
        vl1 = (View)findViewById(R.id.viewlv1);
//        vl2 = (View) findViewById(R.id.viewlv2);
//        vl3 = (View) findViewById(R.id.viewlv3);
//        vl4 = (View) findViewById(R.id.viewlv4);
        tv1 = (TextView) findViewById(R.id.tvNav1);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialoglv1();
            }
        });
//        vl1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openDialoglv1();
//            }
//        });
//
//        vl2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openDialoglv2();
//            }
//        });
//
//        vl3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openDialoglv3();
//            }
//        });
//
//        vl4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openDialoglv4();
//            }
//        });

    }
    private void openDialoglv1() {
        final Dialog dialog = new Dialog(Permainan1.this);
        dialog.setTitle("LEVEL 1");
        dialog.setContentView(R.layout.gamelayout_1);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        Button btnDismiss = (Button) dialog.getWindow().findViewById(R.id.dismiss);

        btnDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void openDialoglv2() {
        final Dialog dialog = new Dialog(Permainan1.this);
        dialog.setTitle("LEVEL 2");
        dialog.setContentView(R.layout.gamelayout_2);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        Button btnDismiss = (Button) dialog.getWindow().findViewById(R.id.dismiss);

        btnDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void openDialoglv3() {
        final Dialog dialog = new Dialog(Permainan1.this);
        dialog.setTitle("LEVEL 3");
        dialog.setContentView(R.layout.gamelayout_3);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        Button btnDismiss = (Button) dialog.getWindow().findViewById(R.id.dismiss);

        btnDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void openDialoglv4() {
        final Dialog dialog = new Dialog(Permainan1.this);
        dialog.setTitle("LEVEL 4");
        dialog.setContentView(R.layout.gamelayout_4);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        Button btnDismiss = (Button) dialog.getWindow().findViewById(R.id.dismiss);

        btnDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }


    }

