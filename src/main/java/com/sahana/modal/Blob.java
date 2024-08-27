package com.sahana.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "imagess")
public class Blob {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Lob
	@Column(columnDefinition = "LONGBLOB", length = 1000000)
	private byte[] prescriptionImage;

//	@ManyToOne
//	@JoinColumn(name = "user_id") // This is the foreign key column
//	private User users;

	public Blob() {
		super();

	}

	public Blob(int id, byte[] prescriptionImage) {
		super();
		this.id = id;
		this.prescriptionImage = prescriptionImage;
//		this.users = users;
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

//	public User getUsers() {
//		return users;
//	}
//
//	public void setUsers(User users) {
//		this.users = users;
//	}

}
