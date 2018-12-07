package com.example.rohitkumarbhamu.barbershop;

public class Barber {
    String barberId;
    String barberShopName;
    String barberNumber;
    String barberAddress;
    String barberOpeningTime;


    public Barber(String barberId, String barberShopName, String barberNumber, String barberAddress, String barberOpeningTime) {
        this.barberId = barberId;
        this.barberShopName = barberShopName;
        this.barberNumber = barberNumber;
        this.barberAddress = barberAddress;
        this.barberOpeningTime = barberOpeningTime;
    }

    public String getBarberId() {
        return barberId;
    }

    public String getBarberShopName() {
        return barberShopName;
    }

    public String getBarberNumber() {
        return barberNumber;
    }

    public String getBarberAddress() {
        return barberAddress;
    }

    public String getBarberOpeningTime() {
        return barberOpeningTime;
    }

    public  Barber(){


    }
}
