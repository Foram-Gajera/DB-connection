import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  try{
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("Load and Register drivers");
	            //1.get connection
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_mgt","root","");
//	            //2.create statement
	            Statement statement=(Statement) con.createStatement();
//	            //3.Execute sql query
	            ResultSet rs=((java.sql.Statement) statement).executeQuery("Select * from student_tbl");
//	            //4.process the result set
	            while(rs.next()){
	                System.out.println(rs.getInt(1));
	                System.out.println(rs.getString(2));
	                System.out.println(rs.getString(3));
	                System.out.println(rs.getInt(4));
	            }
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	}

}
