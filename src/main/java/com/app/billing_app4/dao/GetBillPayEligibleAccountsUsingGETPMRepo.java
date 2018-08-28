package com.app.billing_app4.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.app.billing_app4.model.GetBillPayEligibleAccountsUsingGETP;
public interface GetBillPayEligibleAccountsUsingGETPMRepo extends MongoRepository<GetBillPayEligibleAccountsUsingGETP,String>{

}
