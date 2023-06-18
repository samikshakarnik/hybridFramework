package com.qa.opencart.resources;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CommonMethods {
	
	public static String EmailGenerate() {
		Faker faker = new Faker();
		String Email = faker.name().username() + ("@gmail.com");
		return Email;
	}
	
	
	public static String userName() {
		Faker faker = new Faker();
		String username = faker.name().firstName();
		//System.out.println("username:" + username);
		return username;
	}
	
	public static String password() {
		Faker faker = new Faker();
		String phoneNumber = faker.phoneNumber().phoneNumber();
		//System.out.println("username:" + username);
		return phoneNumber;
	}

}
