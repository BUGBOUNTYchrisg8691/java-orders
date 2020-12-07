package com.lambda.orders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payment
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long paymentid;
	
	@ManyToMany(mappedBy = "payments")
	private Set<Order> orders = new HashSet<>();
	
	private String type;
}
