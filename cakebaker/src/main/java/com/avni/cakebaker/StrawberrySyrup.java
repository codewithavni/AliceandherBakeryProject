package com.avni.cakebaker;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup{
    @Override
    public void getSyrupType(String message) {

        System.out.println("Strawberry Syrup.."+message);

    }
}
