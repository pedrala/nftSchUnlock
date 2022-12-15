package kr.co.hhackers.rewardscheduler.job;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FlagDBConnectionInstance {	
	public Connection flag_connection = null;
	
	public FlagDBConnectionInstance() {
	}
	
    public void getConnection(String DBuserid,String DBpassword,String DBurl,String DBPort, String DBOption) {
    	try {
    		Class.forName("org.mariadb.jdbc.Driver");
    		if(DBPort == null) DBPort = "3306";
    		if(DBOption == null) flag_connection = DriverManager.getConnection(DBurl+":"+DBPort+"/",DBuserid,DBpassword);
    		else flag_connection = DriverManager.getConnection(DBurl+":"+DBPort+"/"+DBOption,DBuserid,DBpassword);
    		
    		flag_connection.setAutoCommit(false);
    		
		}catch (SQLException e) {			
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return glb_connection;
    }
    
    Connection getInstance(String DBuserid,String DBpassword,String DBurl,String DBPort, String DBOption) {
    	if(flag_connection == null) getConnection(DBuserid, DBpassword, DBurl, DBPort, DBOption);
    	return flag_connection; 
    }
    
	public void close() {
		if (flag_connection != null) {
			/** �����ͺ��̽� ���� ���� ó�� */

			try {
				flag_connection.close();
				System.out.println("=== DATABASE Disconnect Success ===");
			} catch (SQLException e) {
				System.out.println("=== DATABASE Disconnect Fail ===");
				System.out.println(e.getMessage());
				System.exit(0);
			}
			flag_connection = null;
		}
	}
	
	
}