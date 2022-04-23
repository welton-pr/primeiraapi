package br.com.weltonjava.primeirapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeira-api")
public class PrimeiraApiController {
	@GetMapping("/ola-mundo")
	public String olaMundo() {
		return "Olá mundo spring boot!";
	}
}
