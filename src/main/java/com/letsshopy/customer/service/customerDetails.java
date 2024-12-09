package com.letsshopy.customer.service;

import java.util.List;

import com.letsshopy.customer.entities.custDetailsEntity;

public interface customerDetails {

	public custDetailsEntity getCustByUN(String uName);

	public List<custDetailsEntity> getAllCust();

}
