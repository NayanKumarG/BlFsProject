package com.bridgelabz.structural.facadedesignpattern;

import java.sql.Connection;

/*
 * program at client side
 */
public class FacadePatternTest {

	public static void main(String[] args) {
     
		String tableName = "Employee";
		
		/*
		 * generating report without using facade 
		 */
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);
		
		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);
		
		/*
		 * generating report with using facade
		 */
		
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}

}
