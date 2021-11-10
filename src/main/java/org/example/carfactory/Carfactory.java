package org.example.carfactory;

public class Carfactory {
    VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator;
    String brand;
    String regNo;



    public Carfactory(VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator, String brand) {
        this.vihicleRegistrationNumberGenerator = vihicleRegistrationNumberGenerator;

        this.brand= brand;

    }

    public Car createNewCar(String color){
        return new Car(color,this.brand,vihicleRegistrationNumberGenerator.getNextRegNo());
    }
}
