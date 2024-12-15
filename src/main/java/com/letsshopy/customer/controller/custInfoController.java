package com.letsshopy.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.letsshopy.customer.bean.customer;
import com.letsshopy.customer.entities.custDetailsEntity;
import com.letsshopy.customer.service.customerDetails;

@RestController
public class custInfoController {
	
	@Autowired
	customerDetails custDet;
	
	@ResponseBody
	@RequestMapping(value="/getdet/cust/getprofinfobyun/{username}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public custDetailsEntity getCustByUN(@PathVariable("username")String uName) {
		return custDet.getCustByUN(uName);
	}
	
	@ResponseBody
	@RequestMapping(value="/getdet/cust/getallcust",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<custDetailsEntity> getAllCust() {
		return custDet.getAllCust();
	}
	
	@ResponseBody
	@RequestMapping(value="/getdet/cust/getcustinfobyid",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public Optional<custDetailsEntity> getcustinfobyid(@RequestBody customer cust) {
		return custDet.getcustinfobyid(cust);
	}
}
