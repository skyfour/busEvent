package com.zjp.busevent;

import com.zjp.busevent.conf.BusConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

@SpringBootApplication
@RemoteApplicationEventScan(basePackageClasses = BusConfiguration.class)
public class BusEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusEventApplication.class, args);
	}

}
