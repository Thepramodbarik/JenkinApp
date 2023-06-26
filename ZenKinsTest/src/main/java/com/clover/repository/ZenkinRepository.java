package com.clover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clover.entity.ZenkinEntity;

@Repository
public interface ZenkinRepository extends JpaRepository<ZenkinEntity, Integer> {
	

}
