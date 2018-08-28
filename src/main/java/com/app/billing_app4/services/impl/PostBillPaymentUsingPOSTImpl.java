package com.app.billing_app4.services.impl;

import java.util.*;

import com.app.billing_app4.model.*;

import com.app.billing_app4.dao.*;
import com.app.billing_app4.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class PostBillPaymentUsingPOSTImpl implements PostBillPaymentUsingPOSTI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public PostBillPaymentUsingPOSTResponseWrapper execute(PostBillPaymentUsingPOSTP pojo){
		//TODO
		return new PostBillPaymentUsingPOSTResponseWrapper();
	}

	public PostBillPaymentUsingPOSTResponseWrapper reliable(PostBillPaymentUsingPOSTP pojo){
		//TODO
		return new PostBillPaymentUsingPOSTResponseWrapper();
	}
}