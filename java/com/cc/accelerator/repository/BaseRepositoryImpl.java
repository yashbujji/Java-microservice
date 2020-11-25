
package com.cc.accelerator.repository;

import static org.springframework.beans.BeanUtils.copyProperties;

import java.io.Serializable;
import java.util.function.Supplier;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
		implements BaseRepository<T, ID> {
	private EntityManager entityManager;

	public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;

	}

	@Override
	public T createEntity(Object src, Supplier<T> instantiator) {
		T desObject = instantiator.get();
		copyProperties(src, desObject);
		return desObject;
	}

	@Override
	public void commanMethodForAllRepo(Object obj) {
		log.info("comman method for All Repository executed ");
	}

}
