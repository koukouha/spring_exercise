package com.example.demo_rpcConsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

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

	@Bean
	public RmiProxyFactoryBean rmiService() {
		RmiProxyFactoryBean proxy = new RmiProxyFactoryBean();
		proxy.setServiceUrl("rmi://localhost/RmiService");
		proxy.setServiceInterface(IRmiService.class);
		return proxy;
	}
}
