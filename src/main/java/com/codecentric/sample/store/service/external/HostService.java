package com.codecentric.sample.store.service.external;

import com.codecentric.sample.store.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HostService {

    public void expand(Customer customer) {

        // Host magic happening here to retrieve the value
        customer.setHostValue("host value");
    }

}
