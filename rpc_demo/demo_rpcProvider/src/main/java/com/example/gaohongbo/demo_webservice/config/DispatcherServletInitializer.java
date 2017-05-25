package com.example.gaohongbo.demo_webservice.config;

import com.example.gaohongbo.demo_webservice.service.IHttpInvokerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Properties;

/**
 * Created by hongbo.gao on 2017/5/24.
 */
@Configuration
public class DispatcherServletInitializer implements WebApplicationInitializer {

	// Create dispatcher servlet
	@Override public void onStartup(ServletContext container) throws ServletException {
		ServletRegistration.Dynamic dispatcher = container.addServlet("appServlet", new DispatcherServlet());
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		dispatcher.addMapping("*.service");
	}

	// Config exporter for HttpInvoker
	@Bean//(name = "/example.service")
	public HttpInvokerServiceExporter httpInvokerServiceExporter(IHttpInvokerService service) {
		HttpInvokerServiceExporter expoter = new HttpInvokerServiceExporter();
		expoter.setService(service);
		expoter.setServiceInterface(IHttpInvokerService.class);
		return expoter;
	}

	// Add handler mapping for service
	@Bean
	public HandlerMapping rpcMapping() {
		SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
		Properties mappings = new Properties();
		mappings.setProperty("/example.service", "httpInvokerServiceExporter");
		mapping.setMappings(mappings);
		mapping.setOrder(1);
		return mapping;
	}
}
