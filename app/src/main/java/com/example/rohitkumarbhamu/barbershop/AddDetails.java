package com.example.rohitkumarbhamu.barbershop;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AddDetails extends AppCompatActivity {

    EditText shopnameEditText,numberEditText,addressEditText,openingTimeEditText;
    Button buttonUpdateDetails;
    DatabaseReference databaseBarber;
    ListView listviewbarbers;
List<Barber> barbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);

        databaseBarber = FirebaseDatabase.getInstance().getReference("barbers");

        shopnameEditText = (EditText)findViewById(R.id.shopNameEditText);
        numberEditText=(EditText)findViewById(R.id.numberEditText);
        addressEditText=(EditText)findViewById(R.id.addressEditText);
        openingTimeEditText=(EditText)findViewById(R.id.openingTimeEditText);
        buttonUpdateDetails=(Button)findViewById(R.id.updateDetailsButton);
        listviewbarbers=(ListView)findViewById(R.id.listViewbarbers);
        barbers= new ArrayList<>();
           buttonUpdateDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            addDetails();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        databaseBarber.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               barbers.clear();
                for (DataSnapshot barberSnapshot: dataSnapshot.getChildren()){
                    Barber barber=barberSnapshot.getValue(Barber.class);
                    barbers.add(barber);
                }
                BarberList adapter = new BarberList(AddDetails.this,barbers);
                listviewbarbers.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void addDetails(){

        String shopName = shopnameEditText.getText().toString().trim();
        String Number = numberEditText.getText().toString().trim();
        String address = addressEditText.getText().toString().trim();
        String OpeningTime = openingTimeEditText.getText().toString().trim();

        if (!TextUtils.isEmpty(shopName) && !TextUtils.isEmpty(Number)&&!TextUtils.isEmpty(address)&&!TextUtils.isEmpty(OpeningTime)){
            String id = databaseBarber.push().getKey();
            Barber barber = new Barber(id,shopName,Number,address,OpeningTime);
            databaseBarber.child(id).setValue(barber);
            Toast.makeText(this,"Barber Added",Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this,"you should enter all the fields",Toast.LENGTH_SHORT).show();
        }



    }
}
