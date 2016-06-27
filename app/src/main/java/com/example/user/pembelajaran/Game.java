package com.example.user.pembelajaran;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Game extends AppCompatActivity {
    Button tout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        tout=(Button)findViewById(R.id.test1);

        tout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogl();
            }
        });
    }

    private void openDialogl() {
        final Dialog dialog = new Dialog(Game.this);
        dialog.setTitle("GAME 1");
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
}
