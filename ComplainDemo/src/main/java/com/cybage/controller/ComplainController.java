package com.cybage.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Complain;

import com.cybage.service.ServiceImplementation;




@RestController
public class ComplainController
{
	@Autowired
	private ServiceImplementation service;
	
	//get all complaints
	@GetMapping("/getAllComplaints")
	public ResponseEntity<?> getAllComplaints()
	{
		
		List<Complain> li = service.findAll();
		return new ResponseEntity<>(li, HttpStatus.OK);
		
	}
	
	@GetMapping("/getComplainById/{id}")//getById/{id}
	public ResponseEntity<?> getComplainById(@PathVariable int id)
	{
		Complain comp = service.getComplainById(id);
		return ResponseEntity.ok(comp);
		
	}
	
	@PostMapping("/addNewComplain")
	public ResponseEntity<?> addNewComplain(@RequestBody Complain comp)
	{
		service.save(comp);
		return new ResponseEntity<>("Complain added successfully", HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteComplainById/{id}")
	public ResponseEntity<?> deleteComplainById(@PathVariable int id)
	{
		boolean comp = service.deleteComplain(id);
		return ResponseEntity.ok(comp);
		
	}
	
	@PutMapping("/updateComplain/{id}")
	public ResponseEntity<?> updateComplain(@PathVariable int id,@RequestBody Complain comp) {
		comp.setComplainId(id);
		Complain updateComplain = service.update(comp);
		
		return new ResponseEntity<>("Updated Complain Data!!!",HttpStatus.OK);
	}
	
	
	
	@PatchMapping("/updateStatus/{id}")   //update status
	
	public ResponseEntity<?>updateStatus(@PathVariable int id,@RequestBody Complain comp)
	{
		comp.setComplainId(id);
		Complain updateComplain = service.update(comp);
		
		return new ResponseEntity<>("Updated Complain Status....",HttpStatus.OK);
	}
	
	
	@GetMapping("/getComplainByStatus/{complainStatus}")//getById/{id}
	public ResponseEntity<?> getComplainByStatus(@PathVariable String complainStatus)
	{
		Complain comp = service.getComplainByStatus(complainStatus);
		return ResponseEntity.ok(comp);
		
	}
	


}//main
