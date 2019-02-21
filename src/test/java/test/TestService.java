package test;

import com.jbw.Model.Order;
import com.jbw.service.webservice.OrderWebService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

public class TestService {
	@Test
	public void service() {
		JaxWsProxyFactoryBean webService = new JaxWsProxyFactoryBean();
		webService.setServiceClass(OrderWebService.class);
		webService.setAddress("http://localhost:8080/orderWs");
		OrderWebService orderWebService = (OrderWebService) webService.create();
		Order order = orderWebService.getOrderbyId(123);
		System.out.println(order);
	}
}
