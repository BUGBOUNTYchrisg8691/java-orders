package com.lambda.orders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agents")
public class Agent
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long agentcode;
	
	@OneToMany(mappedBy = "agent", cascade = CascadeType.ALL, orphanRemoval = false)
	private List<Customer> customers = new ArrayList<>();
	
	private String agentname;
	private String workingarea;
	private double commission;
	private String phone;
	private String country;
}
