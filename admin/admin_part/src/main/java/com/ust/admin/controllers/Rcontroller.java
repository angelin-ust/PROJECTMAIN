package com.ust.admin.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.admin.model.Restaurant;
import com.ust.admin.repo.RestRepo;

@CrossOrigin
@RestController
@RequestMapping("/rest")
public class Rcontroller {

	
	@Autowired
	RestRepo repo;
	
	@CrossOrigin
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody Restaurant rest){
		Restaurant rest1=repo.save(rest);
		
		return ResponseEntity.ok().body(rest1);
	}
	
	@CrossOrigin
	@GetMapping("/all")
	public List<Restaurant> getall(){
		
		
		return repo.findAll();
		}
	
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		repo.deleteById(id);
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update
	(@PathVariable Long id,@RequestBody Restaurant rest ){
		
		Restaurant temp=null;
			Optional<Restaurant> op1=repo.findById(id);
			if(op1.isPresent()) {
			temp=op1.get();
			temp.setRestName(rest.getRestName());
			temp.setRestAddress(rest.getRestAddress());
			temp.setRestContact(rest.getRestContact());
			temp.setRestPic(rest.getRestPic());
			Restaurant rest3=repo.save(temp);
			return ResponseEntity.ok().body(rest3);
			}
			else
			{
				return null;
			}
	}
	
	
	@GetMapping("/getbyid/{id}")
	public Restaurant getbyid(@PathVariable Long id ){
		
		
		Optional<Restaurant> op=repo.findById(id);
		if(op.isPresent()) {
		   
			return op.get();
		}
		else 
	     	return	null;	
	}
}
