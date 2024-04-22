package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Amazon;

@Repository
public interface AmazonRepo extends JpaRepository<Amazon, Long> {

}
