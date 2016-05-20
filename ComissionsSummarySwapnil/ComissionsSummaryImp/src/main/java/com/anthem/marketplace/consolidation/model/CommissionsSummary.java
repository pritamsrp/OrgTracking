package com.anthem.marketplace.consolidation.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Data model object for Commission Summary details. This contains all the data
 * fields mapped to Database. This can be transferred between service and DAO
 * layers.
 * 
 * @author Kishan_Godishala
 *
 */
@Document(collection = "CommissionsSummary")
public class CommissionsSummary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * To store Document id.
	 */
	@Id
	private String commissionId;

	/**
	 * To store collection TIN id.
	 */
	private String tin;

	private Date statementData;

	private Double totalCommPaid;

	private Double paidPremium;

	private String pdfDownload;

	private String excelDownload;

	/**
	 * @return the commissionId
	 */
	public String getCommissionId() {
		return commissionId;
	}

	/**
	 * @param commissionId
	 *            the commissionId to set
	 */
	public void setCommissionId(String commissionId) {
		this.commissionId = commissionId;
	}

	/**
	 * @return the tinId
	 */
	public String getTin() {
		return tin;
	}

	/**
	 * @param tinId
	 *            the tinId to set
	 */
	public void setTin(String tinId) {
		this.tin = tinId;
	}

	/**
	 * @return the statementData
	 */
	public Date getStatementData() {
		return statementData;
	}

	/**
	 * @param statementData
	 *            the statementData to set
	 */
	public void setStatementData(Date statementData) {
		this.statementData = statementData;
	}

	/**
	 * @return the totalCommPaid
	 */
	public Double getTotalCommPaid() {
		return totalCommPaid;
	}

	/**
	 * @param totalCommPaid
	 *            the totalCommPaid to set
	 */
	public void setTotalCommPaid(Double totalCommPaid) {
		this.totalCommPaid = totalCommPaid;
	}

	/**
	 * @return the paidPremium
	 */
	public Double getPaidPremium() {
		return paidPremium;
	}

	/**
	 * @param paidPremium
	 *            the paidPremium to set
	 */
	public void setPaidPremium(Double paidPremium) {
		this.paidPremium = paidPremium;
	}

	/**
	 * @return the pdfDownload
	 */
	public String getPdfDownload() {
		return pdfDownload;
	}

	/**
	 * @param pdfDownload
	 *            the pdfDownload to set
	 */
	public void setPdfDownload(String pdfDownload) {
		this.pdfDownload = pdfDownload;
	}

	/**
	 * @return the excelDownload
	 */
	public String getExcelDownload() {
		return excelDownload;
	}

	/**
	 * @param excelDownload
	 *            the excelDownload to set
	 */
	public void setExcelDownload(String excelDownload) {
		this.excelDownload = excelDownload;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommissionsSummary [commissionId=" + commissionId + ", tinId=" + tin + ", statementData="
				+ statementData + ", totalCommPaid=" + totalCommPaid + ", paidPremium=" + paidPremium + ", pdfDownload="
				+ pdfDownload + ", excelDownload=" + excelDownload + "]";
	}

}
