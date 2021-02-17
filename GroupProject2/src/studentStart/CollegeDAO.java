package studentStart;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CollegeDAO {
	
	public static Connection con;
	public static Statement stmt;

	public CollegeDAO()
	{
		//Constructor does the connection to the database
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/college?useTimezone=true&serverTimezone=UTC";
			con = DriverManager.getConnection(url, "root", "admin");
			stmt = con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println("Error: Failed to connect to database\n" + e.getMessage());
		}
	}
	
	//Method returns a Student object from the database
	public Student getStudent(int id)
	{
		Student student = null;
		try{
			ResultSet rs = stmt.executeQuery("SELECT * FROM student where student_id = "+ id);
 
			while (rs.next()) {
				int studentId = rs.getInt(1);
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				int departmentId = rs.getInt(4);
				
				student = new Student(studentId, firstname, lastname, departmentId);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error getting Student");
			e.printStackTrace();
		}
		return student;
	}
	
	//Method returns a list of Student objects from the database
	public List<Student> getStudents()
	{
		List<Student> studentList = new ArrayList<Student>();
		try{
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
 
			while (rs.next()) {
				int studentId = rs.getInt(1);
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				int departmentId = rs.getInt(4);
				
				Student student = new Student(studentId, firstname, lastname, departmentId);
				studentList.add(student);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error getting Students");
		}
		return studentList;
	}	
}
