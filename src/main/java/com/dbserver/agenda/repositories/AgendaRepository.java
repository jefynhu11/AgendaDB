package com.dbserver.agenda.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbserver.agenda.models.AgendaModel;

public interface AgendaRepository extends CrudRepository<AgendaModel, String> {

	void deleteById(long id);
	Iterable<AgendaModel> findById(long id);
	
}
