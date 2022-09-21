package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    ImageView pepP, cheeseP, mashroomsP,pineappleP;
    TextView id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        pepP =findViewById(R.id.pep);
        cheeseP =findViewById(R.id.cheese);
        mashroomsP =findViewById(R.id.mashroom);
        pineappleP =findViewById(R.id.pineapple);

        id =findViewById(R.id.textView4);
        id.setText(getIntent().getStringExtra("FiacreID"));

        pepP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(), PepperoniPizza.class);
                startActivity(p);
            }
        });

        cheeseP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(getApplicationContext(), CheesePizza.class);
                startActivity(c);
            }
        });

        mashroomsP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Mushrooms.class);
                startActivity(m);
            }
        });

        pineappleP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(), PineApplePizza.class);
                startActivity(p);
            }
        });
    }
}