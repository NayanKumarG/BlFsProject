package com.bridgelabz.structural.facadedesignpattern;

import java.sql.Connection;

/*
 * creating facade pattern interface
 */
public class HelperFacade {

	/*
	 * method to generate report based on type of database and report
	 */
	public static void generateReport(DBTypes dbType , ReportTypes reportType , String tableName)
	{
		Connection con = null;
		switch(dbType)
		{
		case MYSQL :
			con = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			switch(reportType)
			{
			case PDF :
				mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			case HTML :
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			}
			break;
			
		case ORACLE :
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch(reportType)
			{
			case PDF :
				oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			case HTML :
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			}
			break;
		}
		
		
		
		
	}
	
	/*
	 *Enum class for database types
	 */
	public enum DBTypes
	{
		MYSQL , ORACLE;
	}
	
	/*
	 * Enum class for report types
	 */
	public enum ReportTypes
	{
		PDF , HTML;
	}
}
