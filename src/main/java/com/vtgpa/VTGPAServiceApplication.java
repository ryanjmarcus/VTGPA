package com.vtgpa;

import java.io.FileNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VTGPAServiceApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(VTGPAServiceApplication.class, args);
	}

}
