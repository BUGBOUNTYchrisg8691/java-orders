package com.lambda.orders.repositories;

import com.lambda.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Customer repository.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>
{
}
