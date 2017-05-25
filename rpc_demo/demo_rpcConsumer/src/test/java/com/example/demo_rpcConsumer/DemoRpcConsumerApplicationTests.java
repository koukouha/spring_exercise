package com.example.demo_rpcConsumer;

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

	@Test
	public void contextLoads() {
		String result = httpInvokerService.helloClient();
		System.out.println("\n" + result);
	}

}
