package com.letsshopy.customer.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsshopy.customer.dao.customerDetailsDAO;
import com.letsshopy.customer.entities.custDetailsEntity;
import com.letsshopy.customer.service.customerDetails;

@Service
public class customerDetailsImpl implements customerDetails {

	@Autowired
	customerDetailsDAO custDetDAO;

	@Override
	public custDetailsEntity getCustByUN(String uName) {
		// TODO Auto-generated method stub
		return custDetDAO.getCustByUN(uName);
	}
	
	
}
