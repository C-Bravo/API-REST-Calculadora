package com.carlosbravo.backend.repositories;

import com.carlosbravo.backend.models.CalculadoraModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculadoraRepository extends CrudRepository<CalculadoraModel, Long> {
}
