package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Amazon;
import com.example.demo.repo.AmazonRepo;

@Service
public class AmazonService {
	@Autowired
	AmazonRepo amazonRepo;
	public ResponseEntity<Amazon> saveAmazon(@RequestBody Amazon amazon)
	{ 
		return new ResponseEntity<>(amazonRepo.save(amazon),HttpStatus.CREATED);		
	}
	
	
	public List<Amazon> getAmazon() {
		// TODO Auto-generated method stub
		 return amazonRepo.findAll();
		
	}


}
