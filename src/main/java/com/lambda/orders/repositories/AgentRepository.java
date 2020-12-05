package com.lambda.orders.repositories;

import com.lambda.orders.models.Agent;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Agent repository.
 */
public interface AgentRepository extends CrudRepository<Agent, Long>
{
}
