package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	      
        Class.forName("com.mysql.cj.jdbc.Driver");  
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin");
        
        Statement stm = con.createStatement();
        stm.executeUpdate("INSERT into eproduct (name, price, date_added) values ('Tablet', 168900.00, now())");

        ResultSet result = stm.executeQuery("select * from eproduct");
        while(result.next()) {
            
            System.out.print(result.getInt("ID"));
            System.out.println(result.getString("name"));
            
        }
	}

}
