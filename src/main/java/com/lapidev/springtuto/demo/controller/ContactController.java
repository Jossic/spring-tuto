package com.lapidev.springtuto.demo.controller;

import com.lapidev.springtuto.demo.entity.Contact;
import com.lapidev.springtuto.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContactController {
	@Autowired
	ContactRepository repository;

	@GetMapping("/list")
	public List<Contact> list(){
		List<Contact> contacts =new ArrayList<>();
		repository.findAll().forEach(contacts::add);
		return contacts;
	}

}
