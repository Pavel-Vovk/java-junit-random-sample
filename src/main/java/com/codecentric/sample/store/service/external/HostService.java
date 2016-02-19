package com.codecentric.sample.store.service.external;

import com.codecentric.sample.store.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class HostService {

    @Autowired
    private ExternalSystemProxy externalSystemProxy;

    public void expand(Customer customer) {

        // Host magic happening here to retrieve the value
        customer.setHostValue("host value");
    }


    public void connect(String ipAddress) throws IOException {

        if (externalSystemProxy.connectionAvailable(ipAddress)) {
            // Do something here
        }
    }

}
