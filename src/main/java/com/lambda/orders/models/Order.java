package com.lambda.orders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Order.
 */
public class Order
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ordernum;
	
	private double ordamount;
	private double advanceamt;
	private String orderdescription;
	
	@ManyToMany
	@JoinTable(name = "orderspayments", joinColumns = @JoinColumn(name = "ordernum"), inverseJoinColumns =
	@JoinColumn(name = "paymentid"))
	private Set<Payment> payments = new HashSet<>();
	
	/**
	 * Instantiates a new Order.
	 */
	public Order()
	{
	}
	
	/**
	 * Instantiates a new Order.
	 *
	 * @param ordamount        the ordamount
	 * @param advanceamt       the advanceamt
	 * @param orderdescription the orderdescription
	 */
	public Order(double ordamount, double advanceamt, String orderdescription)
	{
		this.ordamount = ordamount;
		this.advanceamt = advanceamt;
		this.orderdescription = orderdescription;
	}
	
	/**
	 * Gets ordernum.
	 *
	 * @return the ordernum
	 */
	public long getOrdernum()
	{
		return ordernum;
	}
	
	/**
	 * Sets ordernum.
	 *
	 * @param ordernum the ordernum
	 */
	public void setOrdernum(long ordernum)
	{
		this.ordernum = ordernum;
	}
	
	/**
	 * Gets ordamount.
	 *
	 * @return the ordamount
	 */
	public double getOrdamount()
	{
		return ordamount;
	}
	
	/**
	 * Sets ordamount.
	 *
	 * @param ordamount the ordamount
	 */
	public void setOrdamount(double ordamount)
	{
		this.ordamount = ordamount;
	}
	
	/**
	 * Gets advanceamt.
	 *
	 * @return the advanceamt
	 */
	public double getAdvanceamt()
	{
		return advanceamt;
	}
	
	/**
	 * Sets advanceamt.
	 *
	 * @param advanceamt the advanceamt
	 */
	public void setAdvanceamt(double advanceamt)
	{
		this.advanceamt = advanceamt;
	}
	
	/**
	 * Gets orderdescription.
	 *
	 * @return the orderdescription
	 */
	public String getOrderdescription()
	{
		return orderdescription;
	}
	
	/**
	 * Sets orderdescription.
	 *
	 * @param orderdescription the orderdescription
	 */
	public void setOrderdescription(String orderdescription)
	{
		this.orderdescription = orderdescription;
	}
}
