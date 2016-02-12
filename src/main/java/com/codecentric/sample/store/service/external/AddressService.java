package com.codecentric.sample.store.service.external;

import com.codecentric.sample.store.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class AddressService {


    public int getPLZForCustomer(Customer customer) {

        // Assume complicated request here that requires some external host services
        // to retrieve the proper PLZ
        return 12345;
    }


    public String getAddressForCustomer(Customer customer) {
        return customer.getAddress();
    }

}
