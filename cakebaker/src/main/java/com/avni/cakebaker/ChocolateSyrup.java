package com.avni.cakebaker;

import org.springframework.stereotype.Component;

@Component
public class ChocolateSyrup implements Syrup{
    @Override
    public void getSyrupType(String message) {

        System.out.println("Chocolate Syrup.."+message);
    }
}
