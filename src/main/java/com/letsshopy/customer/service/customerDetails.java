package com.letsshopy.customer.service;

import java.util.List;
import java.util.Optional;

import com.letsshopy.customer.bean.customer;
import com.letsshopy.customer.entities.custDetailsEntity;

public interface customerDetails {

	public custDetailsEntity getCustByUN(String uName);

	public List<custDetailsEntity> getAllCust();

	public Optional<custDetailsEntity> getcustinfobyid(customer cust);

}
