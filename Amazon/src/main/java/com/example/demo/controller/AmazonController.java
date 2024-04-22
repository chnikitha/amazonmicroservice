package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Amazon;
import com.example.demo.service.AmazonService;

@RestController
public class AmazonController {

	@Autowired
	private AmazonService amazonService;
	
	@PostMapping("/amazon")
	public ResponseEntity<Amazon> saveAmazon(@RequestBody Amazon amazon)
	{ 
		return amazonService.saveAmazon(amazon)	;	
	}
	 
	@GetMapping("/amazon")
	public List<Amazon> getAmazon() 
	{
		return amazonService.getAmazon();
			
	}

}
