package com.letsshopy.customer.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsshopy.customer.bean.customer;
import com.letsshopy.customer.dao.customerDetailsCustomDAO;
import com.letsshopy.customer.dao.customerDetailsDAO;
import com.letsshopy.customer.entities.custDetailsEntity;
import com.letsshopy.customer.service.customerDetails;

@Service
public class customerDetailsImpl implements customerDetails {

	@Autowired
	customerDetailsDAO custDetDAO;
	
	@Autowired
	customerDetailsCustomDAO custDetCustomDAO;

	@Override
	public custDetailsEntity getCustByUN(String uName) {
		// TODO Auto-generated method stub
		return custDetCustomDAO.getCustByUN(uName);
	}

	@Override
	public List<custDetailsEntity> getAllCust() {
		// TODO Auto-generated method stub
		return custDetDAO.findAll();
	}

	@Override
	public Optional<custDetailsEntity> getcustinfobyid(customer cust) {
		// TODO Auto-generated method stub
		int custid = cust.getCustId();
		return custDetDAO.findById(custid);
	}
	
}
