package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.response.MentalHealthResponse;
import com.example.demo.response.PhysicalHealthResponse;
import com.example.demo.service.MentalHealthService;

@CrossOrigin
@RestController
@RequestMapping("/mentalHealth")
public class MentalHealthController {
    @Autowired 
	private  MentalHealthService mentalHealthService; 
	@GetMapping("/getDetails")
	public ResponseEntity<List<MentalHealthResponse>> getDiseaseDetails() {
		List<MentalHealthResponse> list = mentalHealthService.getDetails();
		if(list.isEmpty()) return ResponseEntity.noContent().build();
		return ResponseEntity.ok(list);
	}
}
