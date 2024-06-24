package com.sistema.dao;
import com.sistema.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long> {
}
