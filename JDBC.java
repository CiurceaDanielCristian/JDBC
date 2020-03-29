import java.sql.*;






public class Principal {
	
	public static void main(String[] args) throws Exception{
		
		String url="URL";
		String userName="****";
		String pass="****";
		String query="select * from test";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,userName,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String tara=rs.getString(2);
		System.out.println(tara);
		
		st.close();
		con.close();
		
	}
   
}