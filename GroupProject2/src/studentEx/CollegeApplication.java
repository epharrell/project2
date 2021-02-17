package studentEx;

public class CollegeApplication {
	
	public static void main(String args[])
	{
		//Create the object that contains the methods for database access
		//This type of object is known as a Data Access Object
		CollegeDAO dao = new CollegeDAO(); 
		
		//Create the user interface object and pass the dao to the constructor
		//Start with a command line interface - this can be swapped out later for a GUI
		UserInterface userInterface = new UserInterface(dao);
		
		//Start the user interface
		userInterface.start();
	}
}
