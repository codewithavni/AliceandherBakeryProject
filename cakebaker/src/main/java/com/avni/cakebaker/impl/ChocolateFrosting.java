package com.avni.cakebaker.impl;

import com.avni.cakebaker.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ChocoFrost")
public class ChocolateFrosting implements Frosting {


    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
