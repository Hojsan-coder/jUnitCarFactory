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
        carfactory.addModel("900","Gasoline",90,4);

   Car car = carfactory.createNewCar("900", "Red");

   assertNotNull(car);

   assertEquals("Red",car.getColor());

   assertEquals("Saab", car.getBrand());

   assertEquals("ABC123",car.getRegNo());



    }
    @Test
    void test_create_car_with_model_sucess() {

        VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator = new VihicleRegistrationNumberGenerator(List.of("ABC123"));
        Carfactory carfactory = new Carfactory(vihicleRegistrationNumberGenerator,"Saab");
        carfactory.addModel("900","Gasoline",90,4);

        Car car = carfactory.createNewCar("900","Red");




        assertNotNull(car);

        assertEquals("Gasoline",car.getEngineType());

        assertEquals(90, car.getEnginePower());

        assertEquals(4,car.getNumberOfPassangers());


    }
}
