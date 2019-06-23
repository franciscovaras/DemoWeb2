package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mitocode.model.Personas;

public interface IPersonaRepo extends JpaRepository<Personas, Integer>{
	
}
