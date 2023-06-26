package com.clover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clover.entity.ZenkinEntity;
import com.clover.service.ZenkinService;

import jakarta.validation.Valid;

@RestController
public class ZenkinController {
	
	static {
		System.out.println("inside controller class....");
	}
	
	@Autowired
	private ZenkinService service;

	@PostMapping("/save")
	public ZenkinEntity save(@Valid @RequestBody ZenkinEntity entity) {
		return service.save(entity);
	}
	
	
	
}
