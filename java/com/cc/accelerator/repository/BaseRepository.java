package com.cc.accelerator.repository;

import java.io.Serializable;
import java.util.function.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

	T createEntity(Object src, Supplier<T> instantiator);

	void commanMethodForAllRepo(Object obj);

}
