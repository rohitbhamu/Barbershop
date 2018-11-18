package com.example.rohitkumarbhamu.barbershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserScreen extends AppCompatActivity {

    Button barber1,barber2,barber3,barber4,barber5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_screen);
        barber1 = (Button)findViewById(R.id.Barber1);
        barber2 = (Button)findViewById(R.id.Barber2);
        barber3 = (Button)findViewById(R.id.Barber3);
        barber4 = (Button)findViewById(R.id.Barber4);
        barber5 = (Button)findViewById(R.id.Barber5);

        barber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserScreen.this, BarberProfile.class));

            }
        });
        barber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserScreen.this, BarberProfile.class));

            }
        });
        barber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserScreen.this, BarberProfile.class));

            }
        });
        barber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserScreen.this, BarberProfile.class));

            }
        });
        barber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserScreen.this, BarberProfile.class));

            }
        });

    }
}
