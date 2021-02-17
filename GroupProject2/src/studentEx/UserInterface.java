package studentEx;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	
	CollegeDAO database;	//Used to access the database
	
	public UserInterface(CollegeDAO dao) {
		
		this.database = dao;
	}

	public void start()
	{
		Scanner in = new Scanner(System.in);

		System.out.println("\nEnter 1 to view all Students");
		System.out.println("Enter 2 to ....");
		System.out.println("Enter a choice (-1 to quit)");
		int choice = in.nextInt();
		
		while(choice != -1)
		{
			if(choice == 1)
			{
				List<Student> studentList = database.getStudents();
				for (Student student: studentList)
					System.out.println(student.toString());
			}
			else if(choice == 2)
			{
				//Logic for choice = 2
			}
			else
			{
				System.out.println("You entered an incorrect number!");
			}

			System.out.println("\nEnter 1 to view all Students");
			System.out.println("Enter 2 to ....");
			System.out.println("Enter a choice (-1 to quit)");

			choice = in.nextInt();
		}

		System.out.println("Goodbye!");
		in.close();
	}
}
