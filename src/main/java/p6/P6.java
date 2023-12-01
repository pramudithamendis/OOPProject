package p6;
import java.sql.*;
//import com.mysql.cj.jdbc.Driver;

//import java.lang.*;
 
public class P6 {
	int id;
	public P6(int id) {
		this.id = id;
		
	}

	public void add() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc";
			Connection con = DriverManager.getConnection(url, "root", "");
			System.out.println("3");
			
			Statement st = con.createStatement();
			st.executeUpdate("insert into table1 values(900)");
			con.close();

		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex);
		}

	}
	
	public void disp() {
		System.out.println("Hi. Solved the issue of Class not found");
	}

	public static void main(String args[]) {


//		P6 p = new P6(1);
//		p.add();

	}
}
