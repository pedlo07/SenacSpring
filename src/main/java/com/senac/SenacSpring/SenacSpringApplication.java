package com.senac.SenacSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SenacSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenacSpringApplication.class, args);
	}


@GetMapping ("/Ola")
public String digaOla(@RequestParam(value= "meuNome",defaultValue = "Sem nome") String nome){
	return  String.format("Sadaçoes Camarada %s!", nome);
}
}