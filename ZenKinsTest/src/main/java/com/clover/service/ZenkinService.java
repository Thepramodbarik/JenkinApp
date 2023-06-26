package com.clover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.entity.ZenkinEntity;
import com.clover.repository.ZenkinRepository;

@Service
public class ZenkinService {
	static {
		System.out.println("inside service class....");
	}
	@Autowired
	private ZenkinRepository repo;

	public ZenkinEntity save(ZenkinEntity entity) {

		return repo.save(entity);
	}

}
