package com.anthem.marketplace.consolidation.service;

import java.util.List;

import com.anthem.marketplace.consolidation.model.CommissionsSummary;

/**
 * Service interface to handle all the operations for commissions summary.
 * 
 * @author Kishan_Godishala
 *
 */
public interface CommissionsSummaryService {

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
