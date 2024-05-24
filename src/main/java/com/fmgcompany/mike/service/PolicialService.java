package com.fmgcompany.mike.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmgcompany.mike.model.Policial;
import com.fmgcompany.mike.repository.PolicialRepository;

@Service
public class PolicialService {
    
    @Autowired
    private PolicialRepository policialRepository;

    public List<Policial> findAll() {
        return policialRepository.findAll();
    }

    public Optional<Policial> findById(String id) {
        return policialRepository.findById(id);
    }

    public Policial save(Policial policial) {
        return policialRepository.save(policial);
    } 

    public void deleteById(String id) {
        policialRepository.deleteById(id);
    }

    public boolean existsById(String id) {
        return policialRepository.existsById(id);
    }

    
}