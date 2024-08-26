package com.sahana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sahana.modal.Blob;
import com.sahana.service.BlobServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BlobController {

	@Autowired
	BlobServiceImp service;


	@PostMapping("/prescription")
	public ResponseEntity<String> uploadPrescriptionImage(@RequestParam("prescriptionImage") MultipartFile file) {
		try {
			service.savePrescriptionImage(file);
			return ResponseEntity.ok("File uploaded and saved successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error uploading file");
		}
	}

	@GetMapping("/all")
	public List<Blob> getAllPrescription() {

		return service.getAllPrescription();
	}

}
