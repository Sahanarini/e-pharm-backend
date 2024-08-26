package com.sahana.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "image")
public class Blob {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Lob
	@Column(columnDefinition = "LONGBLOB", length = 1000000)
	private byte[] prescriptionImage;


	public Blob() {
		super();
		this.id = id;
		this.prescriptionImage = prescriptionImage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public byte[] getPrescriptionImage() {
		return prescriptionImage;
	}


	public void setPrescriptionImage(byte[] prescriptionImage) {
		this.prescriptionImage = prescriptionImage;
	}

	
	
	
}
