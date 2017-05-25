package com.example.demo_rpcConsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

/**
 * Created by hongbo.gao on 2017/5/24.
 */
@Configuration
public class ClientProxyConfig {
	@Bean
	public HttpInvokerProxyFactoryBean webService() {
		HttpInvokerProxyFactoryBean proxy = new HttpInvokerProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:8080/example.service");
		proxy.setServiceInterface(IHttpInvokerService.class);
		return proxy;
	}
}
