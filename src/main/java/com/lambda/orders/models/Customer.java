package com.lambda.orders.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The type Customer.
 */
public class Customer
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long custcode;
	
	@Column(nullable = false)
	private String custname;
	
	private String custcity;
	private String workingarea;
	private String grade;
	private double openingamt;
	private double receiveamt;
	private double paymentamt;
	private double outstandingamt;
	private String phone;
	
	/**
	 * Instantiates a new Customer.
	 */
	public Customer()
	{
	}
	
	/**
	 * Instantiates a new Customer.
	 *
	 * @param custname       the custname
	 * @param custcity       the custcity
	 * @param workingarea    the workingarea
	 * @param grade          the grade
	 * @param openingamt     the openingamt
	 * @param receiveamt     the receiveamt
	 * @param paymentamt     the paymentamt
	 * @param outstandingamt the outstandingamt
	 * @param phone          the phone
	 */
	public Customer(String custname, String custcity, String workingarea, String grade, double openingamt, double receiveamt, double paymentamt, double outstandingamt, String phone)
	{
		this.custname = custname;
		this.custcity = custcity;
		this.workingarea = workingarea;
		this.grade = grade;
		this.openingamt = openingamt;
		this.receiveamt = receiveamt;
		this.paymentamt = paymentamt;
		this.outstandingamt = outstandingamt;
		this.phone = phone;
	}
	
	/**
	 * Gets custcode.
	 *
	 * @return the custcode
	 */
	public long getCustcode()
	{
		return custcode;
	}
	
	/**
	 * Sets custcode.
	 *
	 * @param custcode the custcode
	 */
	public void setCustcode(long custcode)
	{
		this.custcode = custcode;
	}
	
	/**
	 * Gets custname.
	 *
	 * @return the custname
	 */
	public String getCustname()
	{
		return custname;
	}
	
	/**
	 * Sets custname.
	 *
	 * @param custname the custname
	 */
	public void setCustname(String custname)
	{
		this.custname = custname;
	}
	
	/**
	 * Gets custcity.
	 *
	 * @return the custcity
	 */
	public String getCustcity()
	{
		return custcity;
	}
	
	/**
	 * Sets custcity.
	 *
	 * @param custcity the custcity
	 */
	public void setCustcity(String custcity)
	{
		this.custcity = custcity;
	}
	
	/**
	 * Gets workingarea.
	 *
	 * @return the workingarea
	 */
	public String getWorkingarea()
	{
		return workingarea;
	}
	
	/**
	 * Sets workingarea.
	 *
	 * @param workingarea the workingarea
	 */
	public void setWorkingarea(String workingarea)
	{
		this.workingarea = workingarea;
	}
	
	/**
	 * Gets grade.
	 *
	 * @return the grade
	 */
	public String getGrade()
	{
		return grade;
	}
	
	/**
	 * Sets grade.
	 *
	 * @param grade the grade
	 */
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	
	/**
	 * Gets openingamt.
	 *
	 * @return the openingamt
	 */
	public double getOpeningamt()
	{
		return openingamt;
	}
	
	/**
	 * Sets openingamt.
	 *
	 * @param openingamt the openingamt
	 */
	public void setOpeningamt(double openingamt)
	{
		this.openingamt = openingamt;
	}
	
	/**
	 * Gets receiveamt.
	 *
	 * @return the receiveamt
	 */
	public double getReceiveamt()
	{
		return receiveamt;
	}
	
	/**
	 * Sets receiveamt.
	 *
	 * @param receiveamt the receiveamt
	 */
	public void setReceiveamt(double receiveamt)
	{
		this.receiveamt = receiveamt;
	}
	
	/**
	 * Gets paymentamt.
	 *
	 * @return the paymentamt
	 */
	public double getPaymentamt()
	{
		return paymentamt;
	}
	
	/**
	 * Sets paymentamt.
	 *
	 * @param paymentamt the paymentamt
	 */
	public void setPaymentamt(double paymentamt)
	{
		this.paymentamt = paymentamt;
	}
	
	/**
	 * Gets outstandingamt.
	 *
	 * @return the outstandingamt
	 */
	public double getOutstandingamt()
	{
		return outstandingamt;
	}
	
	/**
	 * Sets outstandingamt.
	 *
	 * @param outstandingamt the outstandingamt
	 */
	public void setOutstandingamt(double outstandingamt)
	{
		this.outstandingamt = outstandingamt;
	}
	
	/**
	 * Gets phone.
	 *
	 * @return the phone
	 */
	public String getPhone()
	{
		return phone;
	}
	
	/**
	 * Sets phone.
	 *
	 * @param phone the phone
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
}
