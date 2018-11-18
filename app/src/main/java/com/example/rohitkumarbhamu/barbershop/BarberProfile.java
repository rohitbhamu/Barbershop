package com.example.rohitkumarbhamu.barbershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BarberProfile extends AppCompatActivity {
    Button addServiceButton,addSlotButton,updateProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barber_profile);



        findViewById(R.id.AddSlotButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BarberProfile.this, AddDetails.class);
                startActivity(intent);
            }
        });


    }
}
