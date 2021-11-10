package org.example.carfactory;

public class Carfactory {
    VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator;
    String brand;


    public Carfactory(VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator, String brand) {
        this.vihicleRegistrationNumberGenerator = vihicleRegistrationNumberGenerator;

        this.brand = brand;

    }

    public Car createNewCar(String color, String modell,String motorTyp,int motorStyrka, int antalpassagerare) {
        return new Car(color, this.brand, vihicleRegistrationNumberGenerator.getNextRegNo(), modell,motorTyp,motorStyrka,antalpassagerare);
    }
}
