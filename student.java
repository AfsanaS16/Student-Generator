//Afsana Siraj
//Java 212 Homework 2

public class student {
	
	private static String firstName;
	private static String lastName;
	private static int cunyID;
	private static double GPA;
	private static String venusLogIn;
	
	private static int numOfStudents;
	
	//constructor for class student
	public student (String firstName, String lastName, int cunyID, double GPA, String venusLogIn)
	{
		super();
		student.firstName = firstName;
		student.lastName = lastName;
		student.cunyID = cunyID;
		student.GPA = GPA;
		student.venusLogIn = venusLogIn;
		
		numOfStudents++;//increments the number of students when information is entered
	}	
	
	//displays the number of students
	public static int studentsNum(){
		return numOfStudents;
	}
	//displays the GPA of the student
	public double getGPA(){
		return GPA;
	}
	
	public static boolean isValidVenusLogIn(String loginID){
		
		loginID = "";
		loginID = loginID + lastName.substring(0,2);//gets the first 2 digits of last name
		loginID = loginID + firstName.substring(0, 2);//gets the first 2 digits of first name
		String ID = Integer.toString(cunyID);//turns the intID into a string
		loginID = loginID + (ID.substring(ID.length()-4));//extracts the last 4 digits in the string of numbers
		
		if(loginID.equalsIgnoreCase(venusLogIn))
			return true;
		return false;
		
	}
	public static void displayAttributes(){
		
		System.out.println("Student Name: " + firstName + " " + lastName);
		System.out.println("GPA: " + GPA); 
		System.out.println("CUNY ID: " + cunyID);
		venusLogIn = venusLogIn + lastName.substring(0,2);
		venusLogIn = venusLogIn + firstName.substring(0, 2);
		String ID = Integer.toString(cunyID);
		venusLogIn = venusLogIn+ (ID.substring(ID.length()-4));
		System.out.println("Venus LogIn ID: " + venusLogIn);
	
	}
	
	
		
}
	
	
	
	
	
	
	
	
	
	

	

