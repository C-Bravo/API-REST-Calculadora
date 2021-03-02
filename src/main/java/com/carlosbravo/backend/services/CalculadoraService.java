package com.carlosbravo.backend.services;

import com.carlosbravo.backend.models.CalculadoraModel;
import com.carlosbravo.backend.repositories.CalculadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    @Autowired
    CalculadoraRepository calculadoraRepository;

    public CalculadoraModel saveOperation(CalculadoraModel operation){
        return calculadoraRepository.save(operation);
    }

}
