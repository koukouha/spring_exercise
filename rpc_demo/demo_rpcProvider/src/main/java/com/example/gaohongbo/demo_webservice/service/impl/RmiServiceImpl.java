package com.example.gaohongbo.demo_webservice.service.impl;

import com.example.gaohongbo.demo_webservice.service.IRmiService;
import org.springframework.stereotype.Service;

/**
 * Created by hongbo.gao on 2017/5/24.
 */
@Service
public class RmiServiceImpl implements IRmiService {

	public String helloClient() {
		return "From RMI: Hello Client!";
	}
}
