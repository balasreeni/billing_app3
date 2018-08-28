package com.app.billing_app4.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.app.billing_app4.model.GetPayeeListUsingGETP;
public interface GetPayeeListUsingGETPMRepo extends MongoRepository<GetPayeeListUsingGETP,String>{

}
