package com.cc.accelerator.repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cc.accelerator.entity.User;

@Repository
@Transactional
public interface UserRepository extends  BaseRepository<User, Long> {
}
