package com.example.jms_demo.handler;

import com.example.jms_demo.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by hongbo.gao on 2017/6/9.
 */
@Component
public class AlertDemoHandler {

	@Autowired
	IConsumerService consumerService;

	@JmsListener(destination = "spitter.queue")
	public void handleDemoAlert() {
		System.out.println("message arrived!");
		System.out.println("received message is " + consumerService.receiveMessage());
	}
}
