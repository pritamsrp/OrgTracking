package com.anthem.marketplace.consolidation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anthem.marketplace.consolidation.model.CommissionsSummary;
import com.anthem.marketplace.consolidation.repository.CommissionsRepository;

/**
 * 
 * @author Kishan_Godishala
 *
 */
public class CommissionsSummaryServiceImpl implements CommissionsSummaryService {
	
	@Autowired
	CommissionsRepository commissionsRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.anthem.marketplace.consolidation.service.CommissionsSummaryService#
	 * getCommissionSummaryByTin(java.lang.String)
	 */
	public CommissionsSummary getCommissionSummaryByTin(String tinId) {
		// TODO Auto-generated method stub
		
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.anthem.marketplace.consolidation.service.CommissionsSummaryService#
	 * getAllCommissionSummaryByTinList(java.util.List)
	 */
	public List<CommissionsSummary> getAllCommissionSummaryByTinList(List<String> tinIdList) {
		// TODO Auto-generated method stub
		return null;
	}

}
