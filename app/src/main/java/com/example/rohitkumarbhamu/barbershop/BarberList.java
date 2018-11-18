package com.example.rohitkumarbhamu.barbershop;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.List;

public class BarberList extends ArrayAdapter<Barber> {
    private Activity context;
    private List<Barber> barberList;

    public BarberList(Activity context,List<Barber> barberList){
        super(context,R.layout.list_layout,barberList );
        this.context= context;
        this.barberList= barberList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);


        TextView shopName=(TextView)listViewItem.findViewById(R.id.textViewName);
        TextView number=(TextView)listViewItem.findViewById(R.id.textViewnumber);
        TextView openingTime=(TextView)listViewItem.findViewById(R.id.textViewopeningtime);
        TextView address=(TextView)listViewItem.findViewById(R.id.textViewaddress);



        return listViewItem;

    }
}
