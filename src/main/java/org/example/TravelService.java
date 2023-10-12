package org.example;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TravelService {
    @Bean
    public ModelMapper ModelMapper(){
        return new ModelMapper();
    }
    public static void main(String[] args) {
        /*System.out.println("Hello world!");*/
        SpringApplication.run(TravelService.class,args);
    }
}