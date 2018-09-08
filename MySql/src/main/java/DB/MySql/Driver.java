package DB.MySql;
import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		
		try {

			//get connection
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","@zuhaib7");
			
			//create statement
			Statement myst= con.createStatement();
			//execute query
			ResultSet re= myst.executeQuery("select * from details");
			//get resultset
			while(re.next()) System.out.println(re.getInt("empid")+" "+re.getString("empname")+" "+re.getString("lastnmame"));
			
//			insert
			
			Statement inst= con.createStatement();
			
			for (int i = 102; i < 125; i++) {
				
				String query = "insert into details" + "(empid,empname,lastnmame)" + "values("
						+ i
						+ ",'saziya"
						+ i
						+ "','kol"
						+ i
						+ "')";
				inst.execute(query);
			}
			System.out.println("done plz check");
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}
}
