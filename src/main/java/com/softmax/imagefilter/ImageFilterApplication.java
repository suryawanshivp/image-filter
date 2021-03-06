package com.softmax.imagefilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ImageFilterApplication {

public static void main(String[] args) {
SpringApplication.run(ImageFilterApplication.class, args);
}

@GetMapping("/hello")
public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
return String.format("Hello %s!", name);
}

@GetMapping("/vishal")
public String vishal(@RequestParam(value = "name", defaultValue = "Vishal") String name) {
return String.format("Hello %s!", name);
}
}