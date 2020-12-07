package com.lambda.orders.services;

import com.lambda.orders.models.Payment;
import com.lambda.orders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentServicesImpl implements PaymentServices
{
	@Autowired
	PaymentRepository paymentrepos;
	
	@Override public Payment save(Payment payment)
	{
		return paymentrepos.save(payment);
	}
}
