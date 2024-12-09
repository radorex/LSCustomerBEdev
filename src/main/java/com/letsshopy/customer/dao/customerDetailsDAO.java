package com.letsshopy.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsshopy.customer.entities.custDetailsEntity;

public interface customerDetailsDAO extends JpaRepository<custDetailsEntity, Integer> {

	public custDetailsEntity getCustByUN(String uName);

}
