package com.example.user.pembelajaran;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Bilangan extends AppCompatActivity {
    Button angk1, angk2, angk3, angk4, angk5, angk6, angk7, angk8, angk9,angk10;

    Button btn_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_bilangan);

        angk1 = (Button) findViewById(R.id.btn1);
        angk2 = (Button) findViewById(R.id.btn2);
        angk3 = (Button) findViewById(R.id.btn3);
        angk4 = (Button) findViewById(R.id.btn4);
        angk5 = (Button) findViewById(R.id.btn5);
        angk6 = (Button) findViewById(R.id.btn6);
        angk7 = (Button) findViewById(R.id.btn7);
        angk8 = (Button) findViewById(R.id.btn8);
        angk9 = (Button) findViewById(R.id.btn9);
        angk10 = (Button) findViewById(R.id.btn10);


        angk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog1();
            }
        });

        angk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog2();
            }
        });

        angk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog3();
            }
        });

        angk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog4();
            }
        });

        angk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog5();
            }
        });

        angk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog6();
            }
        });

        angk7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog7();
            }
        });

        angk8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog8();
            }
        });

        angk9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog9();
            }
        });

        angk10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog10();
            }
        });

        btn_kembali = (Button) findViewById(R.id.btnkembali);
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kemenuHome = new Intent(Menu_Bilangan.this, Menu.class);
                startActivity(kemenuHome);
            }
        });

    }

    private void openDialog1() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 1");
        dialog.setContentView(R.layout.angklayout_1);
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

    private void openDialog2() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 2");
        dialog.setContentView(R.layout.angklayout_2);
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

    private void openDialog3() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 3");
        dialog.setContentView(R.layout.angklayout_3);
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

    private void openDialog4() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 4");
        dialog.setContentView(R.layout.angklayout_4);
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

    private void openDialog5() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 5");
        dialog.setContentView(R.layout.angklayout_5);
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

    private void openDialog6() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 6");
        dialog.setContentView(R.layout.angklayout_6);
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

    private void openDialog7() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 7");
        dialog.setContentView(R.layout.angklayout_7);
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

    private void openDialog8() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 8");
        dialog.setContentView(R.layout.angklayout_8);
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

    private void openDialog9() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 9");
        dialog.setContentView(R.layout.angklayout_9);
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

    private void openDialog10() {
        final Dialog dialog = new Dialog(Menu_Bilangan.this);
        dialog.setTitle("ANGKA 10");
        dialog.setContentView(R.layout.angklayout_10);
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
