package com.PerformanceTest.PerformanceTest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PerformanceTest.PerformanceTest.model.Demo;
import com.PerformanceTest.PerformanceTest.repository.DemoRepo;

@RestController
public class DemoController {
	
	@Autowired
	private DemoRepo repository;
	
	@PostMapping("/insert")
	public String saveData(@RequestBody Demo demo) {
		repository.save(demo);
		return "Added data with ID: " + demo.getId();
	}
	
	@GetMapping("/")
	public List<Demo> getData() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Demo> getDataByID(@PathVariable int id) {
		return repository.findById(id);
	}

}
