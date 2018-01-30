package com.pedro.fernandez.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Consultation {
	
	@Id
	private Integer id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "consultation")
	private List<Appointment> appointments = new ArrayList<Appointment>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Doctor doctor;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Room room;
	
	private String fecha;
	
	@Enumerated(EnumType.STRING)
	private Turn docsTurn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> consultations) {
		this.appointments = consultations;
	}

	public Doctor getDoctor() {
		return doctor;
	}
	

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	//SI
	public Turn getDocsTurn() {
		return docsTurn;
	}

	public void setDocsTurn(Turn docsTurn) {
		this.docsTurn = docsTurn;
	}
	

}
