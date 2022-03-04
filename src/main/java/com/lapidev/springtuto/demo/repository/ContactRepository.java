package com.lapidev.springtuto.demo.repository;

import com.lapidev.springtuto.demo.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
