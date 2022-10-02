package com.example.springbootexampleformvc;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;


@SpringBootApplication
@MapperScan("com.example.springbootexampleformvc.mapper")
public class SpringBootExampleForMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleForMvcApplication.class, args);
	}

}
