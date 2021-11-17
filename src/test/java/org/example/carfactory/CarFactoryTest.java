package org.example.carfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarFactoryTest {

    private Carfactory carfactory;

    @BeforeEach
    void setUp() {


        VihicleRegistrationNumberGenerator vihicleRegistrationNumberGenerator = new VihicleRegistrationNumberGenerator(List.of("ABC123"));
        carfactory = new Carfactory(vihicleRegistrationNumberGenerator,"Saab");
        carfactory.addModel("900","Gasoline",90,4);

    }

    @Test
    void test_create_car_succes() {


   Car car = carfactory.createNewCar("900", "Red",List.of());

   assertNotNull(car);

   assertEquals("Red",car.getColor());

   assertEquals("Saab", car.getBrand());

   assertEquals("ABC123",car.getRegNo());



    }
    @Test
    void test_create_car_with_model_sucess() {



        Car car = carfactory.createNewCar("900","Red",List.of());




        assertNotNull(car);

        assertEquals("Gasoline",car.getEngineType());

        assertEquals(90, car.getEnginePower());

        assertEquals(4,car.getNumberOfPassangers());


    }

    @Test
    void test_create_car_with_equpment() {


        Car car = carfactory.createNewCar("900","Red", List.of("Xenonljus","Lättmetallfälgar 24","Stolsvärme bak"));

        assertNotNull(car);

        assertEquals(List.of("Xenonljus","Lättmetallfälgar 24","Stolsvärme bak"),car.getEquipment());

    }
}
