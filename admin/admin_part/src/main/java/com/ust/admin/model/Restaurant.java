package com.ust.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String restName;
	String restAddress;
	String restContact;
	String restPic;
	
	public String getRestPic() {
		return restPic;
	}
	public void setRestPic(String restPic) {
		this.restPic = restPic;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getRestAddress() {
		return restAddress;
	}
	public void setRestAddress(String restAddress) {
		this.restAddress = restAddress;
	}
	public String getRestContact() {
		return restContact;
	}
	public void setRestContact(String restContact) {
		this.restContact = restContact;
	}
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	public Restaurant(Long id, String restName, String restAddress, String restContact,String restPic) {
		//super();
		this.id = id;
		this.restName = restName;
		this.restAddress = restAddress;
		this.restContact = restContact;
		this.restPic = restPic;
		
	}
	
}
