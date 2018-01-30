package com.pedro.fernandez.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Appointment {

	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Patient patient;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Consultation consultation;
	
	@GeneratedValue
	private Integer sworder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	public Integer getSworder() {
		return sworder;
	}

	public void setSworder(Integer sworder) {
		this.sworder = sworder;
	}
	

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patient=" + patient + ", consultation=" + consultation + ", sworder="
				+ sworder + "]";
	}
	
	
	
	
	
}
