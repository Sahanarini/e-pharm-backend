package com.sahana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sahana.modal.Blob;
import com.sahana.repository.Blobrep;

import io.jsonwebtoken.io.IOException;

@Service
public class BlobServiceImp implements BlobService {

	@Autowired
	private Blobrep prescriptionRepository;

	public void savePrescriptionImage(MultipartFile file) throws IOException, java.io.IOException {
		Blob blob = new Blob();
		blob.setPrescriptionImage(file.getBytes());
		prescriptionRepository.save(blob);
	}

	@Override
	public List<Blob> getAllPrescription() {
		return prescriptionRepository.findAll();
	}
}
