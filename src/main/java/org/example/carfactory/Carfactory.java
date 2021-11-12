package org.example.carfactory;

public class Carfactory {
    VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator;
    String brand;


    public Carfactory(VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator, String brand) {
        this.vihicleRegistrationNumberGenerator = vihicleRegistrationNumberGenerator;

        this.brand = brand;

    }

    public Car createNewCar(String model, String color) {
        return new Car(color, this.brand, vihicleRegistrationNumberGenerator.getNextRegNo(),"gasoline",90,4);
    }
}
