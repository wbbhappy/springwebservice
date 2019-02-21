package com.jbw.service.webservice.impl;

import com.jbw.Model.Order;
import com.jbw.service.webservice.OrderWebService;
import javax.jws.WebService;

@WebService
public class OrderWebServiceImpl implements OrderWebService {
	public OrderWebServiceImpl(){
		System.out.println("OrderWebServiceImpl");
	}
	
	public Order getOrderbyId(int id) {
		System.out.println("GetOrderById's Id : " + id);
		return new Order(1, "Mr.Jiang's car", 222222);
	}
}
