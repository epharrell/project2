package studentStart;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
		
	public static void main(String args[]) {
		
		CollegeDAO database = new CollegeDAO(); //Create a new instance of the database class
		
		Scanner in = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\nEnter 1 to view all Students");
			System.out.println("Enter 2 to view a particular student");
			System.out.println("Enter 3 to view all Departments");
			System.out.print("Enter a choice (-1 to quit): ");
			choice = in.nextInt();
			
			if(choice != -1)
			{
				if(choice == 1)
				{
					List<Student> studentList = database.getStudents();
					for (Student student: studentList)
						System.out.println(student.toString());
				}
				else if(choice == 2)
				{
					System.out.print("Enter the student id of the student you'd like to view: ");
					int studentId = in.nextInt();
					Student stud = database.getStudent(studentId);
					System.out.println(stud);
				}
				else
				{
					System.out.println("You entered an incorrect number!");
				}

			}
		}while(choice != -1);
			
		System.out.println("Goodbye!");
		in.close();	
	}
}
