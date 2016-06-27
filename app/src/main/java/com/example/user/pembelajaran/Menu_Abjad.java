package com.example.user.pembelajaran;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Abjad extends AppCompatActivity {
    Button hrfA, hrfB, hrfC, hrfD, hrfE, hrfF, hrfG, hrfH, hrfI, hrfJ, hrfK, hrfL, hrfM, hrfN, hrfO, hrfP,
            hrfQ, hrfR, hrfS, hrfT, hrfU, hrfV, hrfW, hrfX, hrfY, hrfZ;

    Button btn_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_abjad);

        hrfA = (Button) findViewById(R.id.btna);
        hrfB = (Button) findViewById(R.id.btnb);
        hrfC = (Button) findViewById(R.id.btnc);
        hrfD = (Button) findViewById(R.id.btnd);
        hrfE = (Button) findViewById(R.id.btne);
        hrfF = (Button) findViewById(R.id.btnf);
        hrfG = (Button) findViewById(R.id.btng);
        hrfH = (Button) findViewById(R.id.btnh);
        hrfI = (Button) findViewById(R.id.btni);
        hrfJ = (Button) findViewById(R.id.btnj);
        hrfK = (Button) findViewById(R.id.btnk);
        hrfL = (Button) findViewById(R.id.btnl);
        hrfM = (Button) findViewById(R.id.btnm);
        hrfN = (Button) findViewById(R.id.btnn);
        hrfO = (Button) findViewById(R.id.btno);
        hrfP = (Button) findViewById(R.id.btnp);
        hrfQ = (Button) findViewById(R.id.btnq);
        hrfR = (Button) findViewById(R.id.btnr);
        hrfS = (Button) findViewById(R.id.btns);
        hrfT = (Button) findViewById(R.id.btnt);
        hrfU = (Button) findViewById(R.id.btnu);
        hrfV = (Button) findViewById(R.id.btnv);
        hrfW = (Button) findViewById(R.id.btnw);
        hrfX = (Button) findViewById(R.id.btnx);
        hrfY = (Button) findViewById(R.id.btny);
        hrfZ = (Button) findViewById(R.id.btnz);

        hrfA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialoga();
            }
        });

        hrfB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogb();
            }
        });

        hrfC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogc();
            }
        });

        hrfD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogd();
            }
        });

        hrfE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialoge();
            }
        });

        hrfF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogf();
            }
        });

        hrfG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogg();
            }
        });

        hrfH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogh();
            }
        });

        hrfI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogi();
            }
        });

        hrfJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogj();
            }
        });

        hrfK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogk();
            }
        });

        hrfL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogl();
            }
        });

        hrfM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogm();
            }
        });

        hrfN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogn();
            }
        });

        hrfO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogo();
            }
        });

        hrfP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogp();
            }
        });

        hrfQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogq();
            }
        });

        hrfR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogr();
            }
        });

        hrfS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogs();
            }
        });

        hrfT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogt();
            }
        });

        hrfU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogu();
            }
        });

        hrfV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogv();
            }
        });

        hrfW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogw();
            }
        });

        hrfX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogx();
            }
        });

        hrfY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogy();
            }
        });

        hrfZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogz();
            }
        });


        btn_kembali = (Button) findViewById(R.id.btnkembali);
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kemenuHome = new Intent(Menu_Abjad.this, Menu.class);
                startActivity(kemenuHome);
            }
        });

    }

    private void openDialoga() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF A");
        dialog.setContentView(R.layout.abjadlayout_a);
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

    private void openDialogb() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF B");
        dialog.setContentView(R.layout.abjadlayout_b);
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

    private void openDialogc() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF C");
        dialog.setContentView(R.layout.abjadlayout_c);
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

    private void openDialogd() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF D");
        dialog.setContentView(R.layout.abjadlayout_d);
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

    private void openDialoge() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF E");
        dialog.setContentView(R.layout.abjadlayout_e);
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

    private void openDialogf() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF F");
        dialog.setContentView(R.layout.abjadlayout_f);
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

    private void openDialogg() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF G");
        dialog.setContentView(R.layout.abjadlayout_g);
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

    private void openDialogh() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF H");
        dialog.setContentView(R.layout.abjadlayout_h);
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

    private void openDialogi() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF I");
        dialog.setContentView(R.layout.abjadlayout_i);
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

    private void openDialogj() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF J");
        dialog.setContentView(R.layout.abjadlayout_j);
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

    private void openDialogk() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF K");
        dialog.setContentView(R.layout.abjadlayout_k);
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

    private void openDialogl() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF L");
        dialog.setContentView(R.layout.abjadlayout_l);
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

    private void openDialogm() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF M");
        dialog.setContentView(R.layout.abjadlayout_m);
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

    private void openDialogn() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF N");
        dialog.setContentView(R.layout.abjadlayout_n);
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

    private void openDialogo() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF O");
        dialog.setContentView(R.layout.abjadlayout_o);
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

    private void openDialogp() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF P");
        dialog.setContentView(R.layout.abjadlayout_p);
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

    private void openDialogq() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF Q");
        dialog.setContentView(R.layout.abjadlayout_q);
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

    private void openDialogr() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF R");
        dialog.setContentView(R.layout.abjadlayout_r);
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

    private void openDialogs() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF S");
        dialog.setContentView(R.layout.abjadlayout_s);
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

    private void openDialogt() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF T");
        dialog.setContentView(R.layout.abjadlayout_t);
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

    private void openDialogu() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF U");
        dialog.setContentView(R.layout.abjadlayout_u);
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

    private void openDialogv() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF V");
        dialog.setContentView(R.layout.abjadlayout_v);
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

    private void openDialogw() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF W");
        dialog.setContentView(R.layout.abjadlayout_w);
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

    private void openDialogx() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF X");
        dialog.setContentView(R.layout.abjadlayout_x);
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

    private void openDialogy() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF Y");
        dialog.setContentView(R.layout.abjadlayout_y);
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

    private void openDialogz() {
        final Dialog dialog = new Dialog(Menu_Abjad.this);
        dialog.setTitle("HURUF Z");
        dialog.setContentView(R.layout.abjadlayout_z);
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
