package myPackage;

import java.sql.*;

public class Main {
	public static void main(String[] args) throws Exception{
		//creating a variable for the connection

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techFamForever?autoReconnect=true&useSSL=false","root", "TechFam");
		//user and pass are root

		//here we create our query
		Statement mystmt = con.createStatement();

		ResultSet result = mystmt.executeQuery("select * from techFamForever.Suppliers");

		while(result.next()){
			System.out.println(result.getString("name") + ", " + result.getString("email"));
		}

	}
}
