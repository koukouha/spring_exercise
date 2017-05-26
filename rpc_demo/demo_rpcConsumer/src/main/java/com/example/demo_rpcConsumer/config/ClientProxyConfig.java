package com.example.demo_rpcConsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

/**
 * Created by hongbo.gao on 2017/5/24.
 */
@Configuration
public class ClientProxyConfig {
	@Bean
	public HttpInvokerProxyFactoryBean httpInvokerService() {
		HttpInvokerProxyFactoryBean proxy = new HttpInvokerProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:8080/httpinvoker.service");
		proxy.setServiceInterface(IHttpInvokerService.class);
		return proxy;
	}

	@Bean
	public HessianProxyFactoryBean hessianService() {
		HessianProxyFactoryBean proxy = new HessianProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:8080/hessian.service");
		proxy.setServiceInterface(IHessianService.class);
		return proxy;
	}
}
