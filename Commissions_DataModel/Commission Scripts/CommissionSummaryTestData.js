var conn = new Mongo();
var db = conn.getDB("SDSCommisions");
db.CommissionsSummary.insert(
	[
	  {
		"tin": "100015",
		"statementDate": new Date("23/11/14"),
		"commissionPaid": 3456.56,
		"paidPremium": 1741.64,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "WGS"
	  },
	  {
		"tin": "100010",
		"statementDate": new Date("04/04/14"),
		"commissionPaid": 1322.7,
		"paidPremium": 1104.11,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "WGS"
	  },
	  {
		"tin": "100013",
		"statementDate": new Date("26/07/15"),
		"commissionPaid": 2147.82,
		"paidPremium": 2574.49,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "CENTRAL"
	  },
	  {
		"tin": "100015",
		"statementDate": new Date("01/05/15"),
		"commissionPaid": 2135.25,
		"paidPremium": 3065.39,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100015",
		"statementDate": new Date("08/11/14"),
		"commissionPaid": 1371.74,
		"paidPremium": 2966.44,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "WGS"
	  },
	  {
		"tin": "100001",
		"statementDate": new Date("12/01/15"),
		"commissionPaid": 3223.12,
		"paidPremium": 2904.79,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100004",
		"statementDate": new Date("02/01/15"),
		"commissionPaid": 3868.19,
		"paidPremium": 2722.07,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "WGS"
	  },
	  {
		"tin": "100015",
		"statementDate": new Date("26/11/14"),
		"commissionPaid": 1095.25,
		"paidPremium": 2664.53,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100003",
		"statementDate": new Date("10/10/15"),
		"commissionPaid": 1176.65,
		"paidPremium": 3448.36,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100010",
		"statementDate": new Date("07/04/15"),
		"commissionPaid": 1374.27,
		"paidPremium": 2562.6,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "CENTRAL"
	  },
	  {
		"tin": "100000",
		"statementDate": new Date("25/04/14"),
		"commissionPaid": 3348.67,
		"paidPremium": 2238.97,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "CENTRAL"
	  },
	  {
		"tin": "100010",
		"statementDate": new Date("13/10/14"),
		"commissionPaid": 2478.47,
		"paidPremium": 1606.46,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100014",
		"statementDate": new Date("27/02/16"),
		"commissionPaid": 2499.21,
		"paidPremium": 1616.15,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100003",
		"statementDate": new Date("22/01/14"),
		"commissionPaid": 2235.57,
		"paidPremium": 2577.97,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100008",
		"statementDate": new Date("20/02/15"),
		"commissionPaid": 1008.03,
		"paidPremium": 3694.39,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "CENTRAL"
	  },
	  {
		"tin": "100009",
		"statementDate": new Date("14/06/15"),
		"commissionPaid": 1828.51,
		"paidPremium": 1207.94,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100009",
		"statementDate": new Date("17/07/14"),
		"commissionPaid": 1850.79,
		"paidPremium": 3538,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100005",
		"statementDate": new Date("13/03/16"),
		"commissionPaid": 1790.38,
		"paidPremium": 2686.55,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "WGS"
	  },
	  {
		"tin": "100009",
		"statementDate": new Date("22/05/14"),
		"commissionPaid": 3427.06,
		"paidPremium": 3825.54,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "CENTRAL"
	  },
	  {
		"tin": "100007",
		"statementDate": new Date("13/09/14"),
		"commissionPaid": 1030.06,
		"paidPremium": 1808.85,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "CENTRAL"
	  },
	  {
		"tin": "100015",
		"statementDate": new Date("02/04/15"),
		"commissionPaid": 1712.47,
		"paidPremium": 3664.83,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100008",
		"statementDate": new Date("12/09/14"),
		"commissionPaid": 1978.27,
		"paidPremium": 3078.34,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100001",
		"statementDate": new Date("28/12/15"),
		"commissionPaid": 1705.95,
		"paidPremium": 1632.07,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100012",
		"statementDate": new Date("02/02/14"),
		"commissionPaid": 2153.08,
		"paidPremium": 3379.72,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  },
	  {
		"tin": "100002",
		"statementDate": new Date("04/06/14"),
		"commissionPaid": 3963.99,
		"paidPremium": 2155.7,
		"pdfDownloadLink": "<TBD>",
		"excelDownloadLink": "<TBD>",
		"source": "ISG"
	  }
	]
);