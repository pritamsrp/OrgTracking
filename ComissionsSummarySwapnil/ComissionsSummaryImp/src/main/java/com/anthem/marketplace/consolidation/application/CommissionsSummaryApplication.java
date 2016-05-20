package com.anthem.marketplace.consolidation.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.anthem.marketplace.consolidation.model.CommissionsSummary;

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
		/*LOGGER.info("CommissionsSummaryApplication execution started :");
		SpringApplication.run(CommissionsSummaryApplication.class, args);*/
		ApplicationContext ctx = 
	             new AnnotationConfigApplicationContext(MongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		Query searchUserQuery = new Query(Criteria.where("tin").is("100015"));

		CommissionsSummary commissionsSummary = 
				mongoOperation.findOne(searchUserQuery, CommissionsSummary.class);
		System.out.println(commissionsSummary.toString());
	}

}
