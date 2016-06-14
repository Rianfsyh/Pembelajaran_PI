package com.example.user.pembelajaran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Menu_Abjad extends AppCompatActivity {
Button hrfA,hrfB,hrfC,hrfD,hrfE,hrfF,hrfG,hrfH,hrfI,hrfJ,hrfK,hrfL,hrfM,hrfN,hrfO,hrfP,
        hrfQ,hrfR,hrfS,hrfT,hrfU,hrfV,hrfW,hrfX,hrfY,hrfZ;

    Button btn_kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_abjad);

        btn_kembali = (Button)findViewById(R.id.btnkembali);


    }
}
