package com.lx.httpinvoker.service.impl;

import com.lx.httpinvoker.service.IHttpInvokerService;

public class HttpInvokerServiceImpl implements IHttpInvokerService {

	public String sayHello(String name) {
		return "Hello " + name;
    }
}
