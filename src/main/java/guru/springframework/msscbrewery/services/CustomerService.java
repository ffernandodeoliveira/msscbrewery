package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto beerDto);

    void updateCustomer(UUID CustomerId, CustomerDto beerDto);

    void deleteCustomer(UUID bCustomerId);
}
