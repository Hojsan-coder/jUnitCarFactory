package org.example.carfactory;

public class Carfactory {
    VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator;
    String brand;


    public Carfactory(VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator, String brand) {
        this.vihicleRegistrationNumberGenerator = vihicleRegistrationNumberGenerator;

        this.brand = brand;

    }

    public Car createNewCar(String model, String color) {
        switch (model) {

            case "900":
                return new Car(color, this.brand, vihicleRegistrationNumberGenerator.getNextRegNo(), "Gasoline", 90, 4);

            case "900 Turbo":
                return new Car(color, this.brand, vihicleRegistrationNumberGenerator.getNextRegNo(), "Gasoline/Turbo", 150, 4);
            case "93":
                return new Car(color, this.brand, vihicleRegistrationNumberGenerator.getNextRegNo(), "Gasoline", 110, 4);
            case "93 aero":
                return new Car(color, this.brand, vihicleRegistrationNumberGenerator.getNextRegNo(), "Gasoline/Turbo", 190, 4);
            case "9-7X":
                return new Car(color, this.brand, vihicleRegistrationNumberGenerator.getNextRegNo(), "Diesel/Turbo", 170, 6);






                default:
                throw new RuntimeException("Unknown model" + model);





        }

    }

}
