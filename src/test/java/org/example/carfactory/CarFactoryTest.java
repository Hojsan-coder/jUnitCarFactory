package org.example.carfactory;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarFactoryTest {

    @Test
    void test_create_car_succes() {

     VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator = new VihicleRegistrationNumberGenerator(List.of("ABC123"));

    Carfactory carfactory = new Carfactory(vihicleRegistrationNumberGenerator,"Saab");

   Car car = carfactory.createNewCar("Red","900","Bensin",90,4);

   assertNotNull(car);

   assertEquals("Red",car.getColor());

   assertEquals("Saab", car.getBrand());

   assertEquals("ABC123",car.getRegNo());

   assertEquals("900",car.getModell());

   assertEquals("Bensin", car.getMotortyp());

   assertEquals(90,car.getMotorStyrka());

   assertEquals(4,car.getAntalPassagerare());

    }
}
