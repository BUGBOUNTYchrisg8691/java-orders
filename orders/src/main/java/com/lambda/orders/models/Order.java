package com.lambda.orders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ordnum;
	
	@ManyToMany
	@JoinTable(name = "orderspayments", joinColumns = @JoinColumn(name = "ordnum"), inverseJoinColumns =
	@JoinColumn(name = "paymentid"))
	Set<Payment> payments = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "custcode", nullable = false)
	private Customer customer;
	
	private long custcode;
	
	private double ordamount;
	private double advanceamount;
	private String orderdescription;
}
