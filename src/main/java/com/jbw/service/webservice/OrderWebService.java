package com.jbw.service.webservice;

import com.jbw.Model.Order;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrderWebService {
	@WebMethod
	public Order getOrderbyId(int id);
}
