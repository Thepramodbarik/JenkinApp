package com.clover.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.clover.entity.ZenkinEntity;
import com.clover.repository.ZenkinRepository;

@SpringBootTest
class ZenkinRepositoryTest {

	@Autowired
	private ZenkinRepository zenkinRepository;

	@Test
	void test() {
		// fail("Not yet implemented");

		List<ZenkinEntity> findAll = zenkinRepository.findAll();

		boolean actualResult = !findAll.isEmpty();
		assertThat(actualResult).isTrue();

	}

}
