package com.avni.cakebaker;

import com.avni.cakebaker.impl.ChocolateFrosting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakebakerApplication implements CommandLineRunner {


	private final Frosting frostobj1;
	private final Syrup syrupobj1;

	public CakebakerApplication(
			@Qualifier("ChocoFrost")Frosting frostobj1,
			@Qualifier("ChocoSyrup")Syrup syrupobj1){

		this.frostobj1 = frostobj1;
		this.syrupobj1 = syrupobj1;
	}
	public static void main(String[] args) {
		SpringApplication.run(CakebakerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Cake baked with"  +  frostobj1.getFrostingType() + " and " +
				syrupobj1.getSyrupType());
	}
}
