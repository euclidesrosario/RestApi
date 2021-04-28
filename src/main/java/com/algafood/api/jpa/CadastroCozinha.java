package com.algafood.api.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.algafood.api.domain.model.Cozinha;

@Component
public class CadastroCozinha {
	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar(){
		TypedQuery<Cozinha> query = manager.createQuery("form Cozinha", Cozinha.class);
		return query.getResultList();
	};
	

}
