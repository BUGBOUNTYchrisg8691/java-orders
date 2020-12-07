package com.lambda.orders.services;

import com.lambda.orders.models.Order;
import com.lambda.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServicesImpl implements OrderServices
{
	@Autowired
	OrderRepository orderrepos;
	
	@Override public Order save(Order order)
	{
		return orderrepos.save(order);
	}
}
