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
	
	public Order()
	{
	}
	
	public Order(double ordamount, double advanceamount, Customer customer,
	             String orderdescription)
	{
		this.customer = customer;
		this.ordamount = ordamount;
		this.advanceamount = advanceamount;
		this.orderdescription = orderdescription;
	}
	
	public long getOrdnum()
	{
		return ordnum;
	}
	
	public void setOrdnum(long ordnum)
	{
		this.ordnum = ordnum;
	}
	
	public Set<Payment> getPayments()
	{
		return payments;
	}
	
	public void setPayments(Set<Payment> payments)
	{
		this.payments = payments;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	public long getCustcode()
	{
		return custcode;
	}
	
	public void setCustcode(long custcode)
	{
		this.custcode = custcode;
	}
	
	public double getOrdamount()
	{
		return ordamount;
	}
	
	public void setOrdamount(double ordamount)
	{
		this.ordamount = ordamount;
	}
	
	public double getAdvanceamount()
	{
		return advanceamount;
	}
	
	public void setAdvanceamount(double advanceamount)
	{
		this.advanceamount = advanceamount;
	}
	
	public String getOrderdescription()
	{
		return orderdescription;
	}
	
	public void setOrderdescription(String orderdescription)
	{
		this.orderdescription = orderdescription;
	}
}
