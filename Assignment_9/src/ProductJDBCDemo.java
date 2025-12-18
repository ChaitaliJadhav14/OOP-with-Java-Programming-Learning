import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductJDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. load driver
		String driverClass = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverClass);
			System.out.println("Class loaded successfully");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2.Connection Details
		String connectionUrl = "jdbc:mysql://localhost:3306/webbasedjava?useSSL=false";
		String userId = "root";
		String password = "aai&dada123";
		
		Connection dbConnection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Statement stmt = null;
		
		
		try {
			//3.Establish connection
			dbConnection = DriverManager.getConnection(connectionUrl,userId,password);
			System.out.println("Connected to database");
			
			//4.create statement 
			stmt = dbConnection.createStatement();
			
			//5.create table
			String createTable = "CREATE TABLE IF NOT EXISTS product("+
				"pid int primary key," +
				"pname varchar(40)," +
				"price DOUBLE)";
			stmt.executeUpdate(createTable);
			
			//6.Insert record
			String insertQuery =
					"INSERT INTO product(pid,pname,price) VALUES (?,?,?)";
			ps = dbConnection.prepareStatement(insertQuery);
//			ps.setInt(1, 1);
//			ps.setString(2, "Laptop");
//			ps.setDouble(3, 55000);
//			ps.executeUpdate();
			
			//Add multiple record
			int[] ids = {2, 3};
			String[] names = {"Mobile", "Tablet"};
			double[] prices = {25000, 18000};

			for (int i = 0; i < ids.length; i++) {
			    ps.setInt(1, ids[i]);
			    ps.setString(2, names[i]);
			    ps.setDouble(3, prices[i]);
			    ps.executeUpdate();
			}
			//7.Retrive record
			String sqlQuery =
					"SELECT * FROM product";
			rs = stmt.executeQuery(sqlQuery);
			
			//8.Display records
			System.out.println("Product records: ");
			while(rs.next()) {
				int pid = rs.getInt("pid");
				String pname = rs.getString("pname");
				double price = rs.getDouble("price");
				
				System.out.println(pid + "," + pname + "," + price + ",");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(ps != null )ps.close();
				if(stmt != null)stmt.close();
				if(dbConnection != null)dbConnection.close();
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
		}
		
		

	}

}
