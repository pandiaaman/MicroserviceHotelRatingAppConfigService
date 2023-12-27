package com.pandiaaman.ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroserviceHotelRatingAppConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHotelRatingAppConfigServerApplication.class, args);
		System.out.println("config server running...");
		System.out.println("++++++++++++++++++++++++++++++");
	}

}
