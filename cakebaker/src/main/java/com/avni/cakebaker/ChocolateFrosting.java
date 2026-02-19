package com.avni.cakebaker;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting{


    @Override
    public void getFrostingType(String message) {

        System.out.println("Chocolate Frosting.."+message);

    }
}
