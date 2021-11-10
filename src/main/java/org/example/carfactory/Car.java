package org.example.carfactory;

public class Car {

    String color;

    String brand;
    String regNo;
    String modell;
    String motortyp;
    int motorStyrka;
    int antalPassagerare;



    public Car(String color, String brand, String regNo ,String modell, String motortyp,int motorStyrka, int antalPassagerare) {
        this.color = color;
        this.brand = brand;
        this.regNo= regNo;
        this.modell = modell;
        this.motortyp=motortyp;
        this.motorStyrka=motorStyrka;
        this.antalPassagerare= antalPassagerare;


    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getMotortyp() {
        return motortyp;
    }

    public void setMotortyp(String motortyp) {
        this.motortyp = motortyp;
    }

    public int getMotorStyrka() {
        return motorStyrka;
    }

    public void setMotorStyrka(int motorStyrka) {
        this.motorStyrka = motorStyrka;
    }

    public int getAntalPassagerare() {
        return antalPassagerare;
    }

    public void setAntalPassagerare(int antalPassagerare) {
        this.antalPassagerare = antalPassagerare;
    }


}
