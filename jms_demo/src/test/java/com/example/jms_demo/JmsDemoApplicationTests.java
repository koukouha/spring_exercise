package com.example.jms_demo;

import com.example.jms_demo.service.IConsumerService;
import com.example.jms_demo.service.IProducerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsDemoApplicationTests {

	@Autowired
	IProducerService producerService;

	@Autowired
	IConsumerService consumerService;

	@Test
	public void sendMessage() {
		for (int i = 1; i <= 1; i++) {
			producerService.sendMessage("message: " + Integer.toString(i));
		}
	}

	@Test
	public void receiveMessage() {
		System.out.println("received message is " + consumerService.receiveMessage());
	}

}
