package com.codecentric.sample.store.service;

import com.codecentric.sample.store.model.Customer;
import com.codecentric.sample.store.model.Item;
import com.codecentric.sample.store.repository.ItemRepository;
import com.codecentric.sample.store.service.external.AddressService;
import com.codecentric.sample.store.service.tools.StaticService;
import com.sun.jndi.cosnaming.IiopUrl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

public class CustomerServiceTest {

    @Spy
    private AddressService addressService;

    @InjectMocks
    private CustomerService customerService;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testPLZAddressCombination() {


        Customer customer = new Customer("204", "John Do", "224B Bakerstreet");

        when(addressService.getPLZForCustomer(customer)).thenReturn(47891);
        String address = customerService.getPLZAddressCombination(customer);

        assertThat(address, is("47891224B Bakerstreet"));
    }
}
