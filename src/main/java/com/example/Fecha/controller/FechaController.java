package com.example.Fecha.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(path ="api/fecha")
public class FechaController {


		int i;
	@GetMapping(path = "/")
	public ResponseEntity<String> getFecha() {
		i++;
		log.info("El servicio se utilizó " + i + " veces");

		return new ResponseEntity<>("La fecha actual es " + LocalDateTime.now() + "\n	El servicio se utilizó " + i + " veces", HttpStatus.OK);
	}
}
