package com.avni.cakebaker;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting {
    @Override
    public void getFrostingType(String message) {

        System.out.println("Strawberry Frosting.."+message);

    }
}
