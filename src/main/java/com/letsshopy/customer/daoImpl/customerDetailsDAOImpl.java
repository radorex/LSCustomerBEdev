package com.letsshopy.customer.daoImpl;

import org.springframework.stereotype.Repository;

import com.letsshopy.customer.dao.customerDetailsDAO;
import com.letsshopy.customer.entities.custDetailsEntity;

@Repository
public class customerDetailsDAOImpl
//implements customerDetailsDAO 
{

//	@Override
	public custDetailsEntity getCustByUN(String uName) {
		// TODO Auto-generated method stub
		custDetailsEntity cust = new custDetailsEntity();
		cust.setUsername(uName);
		return cust;
	}

}
