package com.example.ioana.projectshoesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ioana.projectshoesshop.shop.ManShoes;
import com.example.nikoleta.projectshoes.R;

public class ManShoesActivity extends AppCompatActivity {

    private Button womanShoesButton;
    private Button manShoesButton;
    private Button bagsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woman_shoes);

        womanShoesButton = (Button) this.findViewById(R.id.womanShoesButton);
        manShoesButton = (Button) this.findViewById(R.id.manShoesButton);
        bagsButton = (Button) this.findViewById(R.id.bagsButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, WomanShoesActivity.class);
                ManShoesActivity.this.startActivity(intent);
                finish();
            }
        };
        womanShoesButton.setOnClickListener(listener);

        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, ManShoesActivity.class);
                ManShoesActivity.this.startActivity(intent);
                finish();
            }
        };
        manShoesButton.setOnClickListener(listener1);

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManShoesActivity.this, BagsActivity.class);
                ManShoesActivity.this.startActivity(intent);
                finish();
            }
        };
        bagsButton.setOnClickListener(listener2);
    }
}
