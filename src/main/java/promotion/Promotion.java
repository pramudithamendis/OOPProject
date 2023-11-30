package promotion;

import java.sql.*;
import java.util.*;

public class Promotion {

	private int id;
	private String name;
	private String Vehichle_type;
	
	public Promotion() {
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	
	
	public String getVehichle_type() {
		return Vehichle_type;
	}


	public void setVehichle_type(String vehichle_type) {
		Vehichle_type = vehichle_type;
	}
	
	private void setId(int id2) {
		// TODO Auto-generated method stub
		this.id = id2;
		
	}


	public int getId() {
		return id;
	}


	public void add(String no, String no2) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc";
			Connection con = DriverManager.getConnection(url, "root", "");
			
			PreparedStatement st = con.prepareStatement("insert into table1(Name, Vehicle_type) values(?,?)");
			st.setString(1, no);
			st.setString(2, no2);
			
			st.executeUpdate();
			con.close();

		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex);
		}

	}
	
	public ArrayList List(){


				ArrayList<Promotion> l = new ArrayList<>();
				
				
				
				try {
				Class.forName("com.mysql.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/jdbc";
				Connection con = DriverManager.getConnection(url, "root", "");
				
				Statement st = con.createStatement();
				
				
				ResultSet rs = st.executeQuery("Select id, Name, Vehicle_type from table1");
				
				
				
				
					
				while(rs.next()) {
				
				Promotion p = new Promotion();
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String V = rs.getString(3);
				
				
				p.setId(id);
				p.setName(name);
				p.setVehichle_type(V);
				
				l.add(p);
				
	
				}
				
				con.close();
				return l;
				
				}catch(Exception e) {}
				return l;
	}
	



	public void Delete(int no) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc";
			Connection con = DriverManager.getConnection(url, "root", "");
			
			PreparedStatement st = con.prepareStatement("delete from table1 where id = ?");
			st.setInt(1, no);
			
			st.executeUpdate();
			con.close();

		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex);
		}

		
	}
	
	public void Update(int no, String no2) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc";
			Connection con = DriverManager.getConnection(url, "root", "");
			
			PreparedStatement st = con.prepareStatement("update table1 set Name = ? where id = ?");
			st.setString(1, no2);
			st.setInt(2, no);
			
			st.executeUpdate();
			con.close();

		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex);
		}
		
	}
	
	
	
	 
	public static void main(String ags[]) {

		Promotion p = new Promotion();
		
		p.setId(242);
		int i = p.getId();
		
		System.out.println(i);
		
		

	}
	
}
