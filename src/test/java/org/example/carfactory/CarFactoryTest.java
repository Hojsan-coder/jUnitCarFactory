package org.example.carfactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarFactoryTest {

    @Test
    void test_create_car_succes() {

     VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator = new VihicleRegistrationNumberGenerator(List.of("ABC123"));
     Carfactory carfactory = new Carfactory(vihicleRegistrationNumberGenerator,"Saab");

   Car car = carfactory.createNewCar("900", "Red");

   assertNotNull(car);

   assertEquals("Red",car.getColor());

   assertEquals("Saab", car.getBrand());

   assertEquals("ABC123",car.getRegNo());



    }
    @ParameterizedTest
    @CsvSource({
            "900,Gasoline,90,4",
            "900 Turbo, Gasoline/Turbo,150,4",
            "93,Gasoline,110,4",
            "93 aero,Gasoline/Turbo,190,4",
            "9-7X,Diesel/Turbo,170,6"

    })
    void test_create_car_with_model_sucess(String model,String enginetype,int enginePower,int numberOfPassangers) {

        VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator = new VihicleRegistrationNumberGenerator(List.of("ABC123"));
        Carfactory carfactory = new Carfactory(vihicleRegistrationNumberGenerator,"Saab");

        Car car = carfactory.createNewCar(model,"Red");




        assertNotNull(car);

        assertEquals(enginetype,car.getEngineType());

        assertEquals(enginePower, car.getEnginePower());

        assertEquals(numberOfPassangers,car.getNumberOfPassangers());


    }
}
