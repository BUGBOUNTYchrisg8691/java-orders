package com.lambda.orders.repositories;

import com.lambda.orders.models.Payment;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Payment repository.
 */
public interface PaymentRepository extends CrudRepository<Payment, Long>
{
}
