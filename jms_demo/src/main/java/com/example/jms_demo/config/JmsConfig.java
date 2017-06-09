package com.example.jms_demo.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

/**
 * Created by hongbo.gao on 2017/6/9.
 */
@Configuration
public class JmsConfig {

	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
		cf.setBrokerURL("tcp://localhost:61616");
		return cf;
	}

	@Bean
	public ActiveMQQueue queue() {
		ActiveMQQueue queue = new ActiveMQQueue("spitter.queue");
		return queue;
	}

	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory());
		jmsTemplate.setDefaultDestination(queue());
		return jmsTemplate;
	}

}
