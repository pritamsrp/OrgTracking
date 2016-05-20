package com.anthem.marketplace.consolidation.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class to have the Spring Boot main Application. The application execution
 * will start from this class. It also configures the required server
 * configurations like whether it has to register with Registry Servers like
 * "Eureka", whether it needs to use the Load Balancer features or not etc.
 * 
 * @author Kishan_Godishala
 * 
 */

@SpringBootApplication
public class CommissionsSummaryApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommissionsSummaryApplication.class);

	public static void main(String[] args) {
		LOGGER.info("CommissionsSummaryApplication execution started :");
		SpringApplication.run(CommissionsSummaryApplication.class, args);
	}

}
