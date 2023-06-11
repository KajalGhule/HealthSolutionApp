package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.response.PhysicalDiseaseResponse;
import com.example.demo.response.PhysicalHealthResponse;
import com.example.demo.service.PhysicalHealthService;

@CrossOrigin
@RestController
@RequestMapping("/physicalHealth")
public class PhysicalHealthController {
	@Autowired
    private PhysicalHealthService physicalHealthService;
	/* 
	 * In this method we featch all the physical Disease 
	 * */
	@GetMapping("/physicalDisease")
	public ResponseEntity<List<PhysicalDiseaseResponse>> getAllDisease() {
		List<PhysicalDiseaseResponse> list = physicalHealthService.getAllDisease();
		if(list.isEmpty()) return ResponseEntity.noContent().build();
		return ResponseEntity.ok(list);
	}
	/* 
	 * In this method we featch all the physical Disease Details
	 * */

	@GetMapping("/getDiseaseDetails")
	public ResponseEntity<List<PhysicalHealthResponse>> getDiseaseDetails() {
		List<PhysicalHealthResponse> list = physicalHealthService.getDiseaseDetails();
		if(list.isEmpty()) return ResponseEntity.noContent().build();
		return ResponseEntity.ok(list);
	}
	
	/* 
	 * In this method we featch single physical Disease Details
	 * */

	@GetMapping("/{physicalHealthProblem}")
	public ResponseEntity<PhysicalHealthResponse> getDiseaseDetails(@PathVariable String physicalHealthProblem) {
		PhysicalHealthResponse response = physicalHealthService.getDiseaseDetail(physicalHealthProblem);
		if(response == null) return ResponseEntity.noContent().build();
		return ResponseEntity.ok(response);
	}
	
}
