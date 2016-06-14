package com.example.user.pembelajaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button bt_abjd,bt_angka,bt_game,bt_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        bt_abjd = (Button)findViewById(R.id.btnabjad);
        bt_angka = (Button)findViewById(R.id.btnbilangan);
        bt_game = (Button)findViewById(R.id.btnpermainan);
        bt_exit = (Button)findViewById(R.id.btnkeluar);

        bt_abjd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMenuAbjad = new Intent(Menu.this, Menu_Abjad.class);
                startActivity(keMenuAbjad);
            }
        });

        bt_angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMenuBilangan = new Intent(Menu.this, Menu_Bilangan.class);
                startActivity(keMenuBilangan);
            }
        });

        bt_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMenuPermainan = new Intent(Menu.this, Menu_Bilangan.class);
                startActivity(keMenuPermainan);

            }
        });

        bt_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMenuKeluar = new Intent(Menu.this, Menu_Abjad.class);

            }
        });
    }
}
