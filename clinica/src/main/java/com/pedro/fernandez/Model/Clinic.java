package com.pedro.fernandez.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Clinic {
	
	@Id
	private Integer id;
	
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clinic")
	private List<Room> rooms = new ArrayList<Room>();
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Clinic [id=" + id + ", name=" + name + ", rooms=" + rooms + "]";
	}

	
	
	

}
