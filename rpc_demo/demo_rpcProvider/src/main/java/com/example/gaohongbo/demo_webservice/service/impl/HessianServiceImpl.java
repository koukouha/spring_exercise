package com.example.gaohongbo.demo_webservice.service.impl;

import com.example.gaohongbo.demo_webservice.service.IHessianService;
import org.springframework.stereotype.Service;

/**
 * Created by hongbo.gao on 2017/5/24.
 */
@Service
public class HessianServiceImpl implements IHessianService {

	public String helloClient() {
		return "From Hessian: Hello Client!";
	}
}
