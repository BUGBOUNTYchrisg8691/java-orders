package com.lambda.orders.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The type Payment.
 */
public class Payment
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long paymentid;
	
	@Column(nullable = false)
	private String type;
	
	/**
	 * Instantiates a new Payment.
	 */
	public Payment()
	{
	}
	
	/**
	 * Instantiates a new Payment.
	 *
	 * @param type the type
	 */
	public Payment(String type)
	{
		this.type = type;
	}
	
	/**
	 * Gets paymentid.
	 *
	 * @return the paymentid
	 */
	public long getPaymentid()
	{
		return paymentid;
	}
	
	/**
	 * Sets paymentid.
	 *
	 * @param paymentid the paymentid
	 */
	public void setPaymentid(long paymentid)
	{
		this.paymentid = paymentid;
	}
	
	/**
	 * Gets type.
	 *
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * Sets type.
	 *
	 * @param type the type
	 */
	public void setType(String type)
	{
		this.type = type;
	}
}
