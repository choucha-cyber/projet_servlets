package repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
		
		public static Connection getConnection() {
			
			String url = "jdbc:mysql://localhost:8889/";
			String dbName = "exam_ajc";
			String user = "root";
			String password = "root";
			
			Connection connect =  null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connect = DriverManager.getConnection(url+dbName,user,password);
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Not Connected");
			}
			return connect;
		}
	}
