package com.anthem.marketplace.consolidation.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anthem.marketplace.consolidation.model.CommissionsSummary;

/**
 * MongoRepository interface to configure all the required operations to handle
 * in the DAO layer.
 * 
 * @author Kishan_Godishala
 *
 */
public interface CommissionsRepository extends MongoRepository<CommissionsSummary, String> {

	/**
	 * Method to send the commission summary Document object for the given
	 * tinId.
	 * 
	 * @param tinId
	 *            Tin Id reference
	 * @return CommissionSummary
	 */
	public CommissionsSummary getCommissionSummaryByTin(String tinId);

	/**
	 * Method to send all the list of commission summary Document object for the
	 * given tinId list.
	 * 
	 * @param tinIdList
	 *            Tin Ids list
	 * @return List<CommissionSummary>
	 */
	public List<CommissionsSummary> getAllCommissionSummaryByTinList(List<String> tinIdList);
}
