package com.example.demo_rpcConsumer;

import com.example.demo_rpcConsumer.config.IHessianService;
import com.example.demo_rpcConsumer.config.IHttpInvokerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoRpcConsumerApplicationTests {

	@Autowired
	IHttpInvokerService httpInvokerService;

	@Autowired
	IHessianService hessianService;

	@Test
	public void testHttpInvoker() {
		String result = httpInvokerService.helloClient();
		System.out.println("\n" + result);
	}

	@Test
	public void testHessian() {
		String result = hessianService.helloClient();
		System.out.println("\n" + result);
	}

}
