package com.avni.cakebaker;

import org.springframework.beans.factory.annotation.Qualifier;

//@Component
@Qualifier("StrawberrySyrup")

public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Strawberry Frosting";
    }
}
