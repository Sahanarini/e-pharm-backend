package com.sahana.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.sahana.modal.Blob;

import io.jsonwebtoken.io.IOException;

public interface BlobService {
	public void savePrescriptionImage(MultipartFile file) throws IOException, java.io.IOException;
	public List<Blob> getAllPrescription();

}
