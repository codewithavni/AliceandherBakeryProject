package com.avni.cakebaker;

import org.springframework.beans.factory.annotation.Qualifier;

//@Component
@Qualifier("StrawberryFrost")

public class StrawberryFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
