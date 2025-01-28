package com.example.demo.service;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Optional<Contact> getContactById(String id) {
        return contactRepository.findById(id);
    }

    public Contact updateContact(String id, Contact contact) {
        contact.setId(id);
        return contactRepository.save(contact);
    }

    public void deleteContact(String id) {
        contactRepository.deleteById(id);
    }
} 