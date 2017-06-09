package com.example.jms_demo.service.impl;

import com.example.jms_demo.service.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by hongbo.gao on 2017/6/9.
 */
@Service
public class ProducerServiceImpl implements IProducerService {

	@Autowired
	private JmsOperations jmsOperations;

	@Override public void sendMessage(String message) {
		jmsOperations.send(
				new MessageCreator() {
					@Override public Message createMessage(Session session) throws JMSException {
						System.out.println("sent message!");
						return session.createTextMessage(message);
					}
				}
		);
	}
}
