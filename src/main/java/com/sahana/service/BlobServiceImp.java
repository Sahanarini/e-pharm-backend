package com.sahana.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.sahana.modal.Blob;
import com.sahana.repository.Blobrep;

@Service
public class BlobServiceImp implements BlobService {

    @Autowired
    private Blobrep blobRepository;

    @Transactional
    @Override
    public void savePrescriptionImage(MultipartFile file) throws IOException {
        Blob blob = new Blob();
        blob.setPrescriptionImage(file.getBytes());
        blobRepository.save(blob);
    }

    @Override
    public List<Blob> getAllPrescription() {
        return blobRepository.findAll();
    }
    
    public Blob getBlobById(int id) {
        return blobRepository.findById(id).orElse(null);
    }
}
