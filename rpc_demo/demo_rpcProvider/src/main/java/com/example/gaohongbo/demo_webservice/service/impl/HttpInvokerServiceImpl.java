package com.example.gaohongbo.demo_webservice.service.impl;

import com.example.gaohongbo.demo_webservice.service.IHttpInvokerService;
import org.springframework.stereotype.Service;

/**
 * Created by hongbo.gao on 2017/5/24.
 */
@Service
public class HttpInvokerServiceImpl implements IHttpInvokerService {

	public String helloClient() {
		return "From Server: Hello Client!";
	}
}
