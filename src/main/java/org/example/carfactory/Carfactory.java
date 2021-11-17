package org.example.carfactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carfactory {
    VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator;
    String brand;
    Map<String, Model> models = new HashMap<String, Model>();


    public Carfactory(VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator, String brand) {
        this.vihicleRegistrationNumberGenerator = vihicleRegistrationNumberGenerator;

        this.brand = brand;

    }

    public Car createNewCar(String modelAsText, String color, List<String> equipment) {
       Model model = models.get(modelAsText);
       if (model == null)
           throw new RuntimeException("Unknown model" + model);
           return new Car(color,
                   this.brand,
                   vihicleRegistrationNumberGenerator.getNextRegNo(),
                   model.getEnginetype(),
                   model.getEnginePower(),
                   model.getNumberOfPassangers(),
                   equipment);
       }




    public void addModel( String model,  String enginetype,  int enginePower, int numberOfPassangers) {
   models.put(model,new Model(model,enginetype,enginePower,numberOfPassangers));

    }

    public static class Model{
        String model;
        String enginetype;
        int enginePower;
        int numberOfPassangers;

        public Model(String model, String enginetype, int enginePower, int numberOfPassangers) {
            this.model = model;
            this.enginetype = enginetype;
            this.enginePower = enginePower;
            this.numberOfPassangers = numberOfPassangers;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getEnginetype() {
            return enginetype;
        }

        public void setEnginetype(String enginetype) {
            this.enginetype = enginetype;
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
}
