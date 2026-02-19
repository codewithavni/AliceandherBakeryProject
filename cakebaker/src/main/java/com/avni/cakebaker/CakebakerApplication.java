package com.avni.cakebaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakebakerApplication implements CommandLineRunner {

	@Autowired
	ChocolateFrosting frostobj1;

	@Autowired
	StrawberryFrosting frostobj2;

	@Autowired
	ChocolateSyrup syrupobj1;

	@Autowired
	StrawberrySyrup syrupobj2;

	public static void main(String[] args) {
		SpringApplication.run(CakebakerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		frostobj1.getFrostingType("Choco");
		frostobj2.getFrostingType("pink");
		syrupobj1.getSyrupType("chocomoco");
		syrupobj2.getSyrupType("pinky");
	}
}
