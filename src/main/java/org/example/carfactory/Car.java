package org.example.carfactory;

public class Car {

    String color;

    String brand;
    String regNo;

    String engineType;

    int enginePower;

    int numberOfPassangers;


    public Car(String color, String brand, String regNo, String engineType, int enginePower, int numberOfPassangers) {
        this.color = color;
        this.brand = brand;
        this.regNo = regNo;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.numberOfPassangers = numberOfPassangers;
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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }
}
