package org.example.carfactory;

import java.util.ArrayList;
import java.util.List;

public class VihicleRegistrationNumberGenerator {

    List<String>regNumbers;

    public VihicleRegistrationNumberGenerator(List<String> regNumbers) {
        this.regNumbers = new ArrayList<>(regNumbers) ;
    }

    public String getNextRegNo() {

        return  regNumbers.remove(0);
    }
}
