package com.lambda.orders.repositories;

import com.lambda.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Order repository.
 */
public interface OrderRepository extends CrudRepository<Order, Long>
{
}
