package com.example.jms_demo.service.impl;

import com.example.jms_demo.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.support.JmsUtils;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * Created by hongbo.gao on 2017/6/9.
 */
@Service
public class ConsumerServiceImpl implements IConsumerService{

	@Autowired
	JmsOperations jmsOperations;

	@Override public String receiveMessage() {
		try {
			TextMessage receivedMessage = (TextMessage) jmsOperations.receive();
			System.out.println("received message!");
			return receivedMessage.getText();
		} catch (JMSException e) {
			throw JmsUtils.convertJmsAccessException(e);
		}
	}
}
