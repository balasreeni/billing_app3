package com.app.billing_app4.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.app.billing_app4.model.RegisterBillPaymentUsingPOSTP;
public interface RegisterBillPaymentUsingPOSTPMRepo extends MongoRepository<RegisterBillPaymentUsingPOSTP,String>{

}
