package com.PerformanceTest.PerformanceTest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.PerformanceTest.PerformanceTest.model.Demo;

public interface DemoRepo extends MongoRepository<Demo, Integer>{

}
