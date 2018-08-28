package com.app.billing_app4.services.impl;

import java.util.*;

import com.app.billing_app4.model.*;

import com.app.billing_app4.dao.*;
import com.app.billing_app4.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class RegisterBillPaymentUsingPOSTImpl implements RegisterBillPaymentUsingPOSTI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public RegisterBillPaymentUsingPOSTResponseWrapper execute(RegisterBillPaymentUsingPOSTP pojo){
		//TODO
		return new RegisterBillPaymentUsingPOSTResponseWrapper();
	}

	public RegisterBillPaymentUsingPOSTResponseWrapper reliable(RegisterBillPaymentUsingPOSTP pojo){
		//TODO
		return new RegisterBillPaymentUsingPOSTResponseWrapper();
	}
}