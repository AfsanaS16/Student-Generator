import javax.swing.JOptionPane;

public class StudentGenerator extends student {

public StudentGenerator(String firstName, String lastName, int cunyID, double GPA, String venusLogIn) {
		super(firstName, lastName, cunyID, GPA, venusLogIn);
		// Auto-generated constructor stub
	}

public static void main(String[] args){
		
		String input = JOptionPane.showInputDialog("How many students?"); //asks user for number of students
		int numOfStud = Integer.parseInt(input);//checks to see if value is an integer
		
		String firstNames[] ={"Luis" , "Sebastian" , "Milana", "Marcos", "Laura" , "Lavaissa" , "Joel" , "Junior",  "Freddy ", "Victor", "Jason"};
		String lastNames[] = {"Marquez", "Florez", "Muratova", "Maldonado", "Urbina", "Banton", "Ramirez", "Gonzalez", "Smith", "Martinez", "Cevallos"};
		double GPA = 0.0;
		String venusLogIn = "";
		
		student[] stud = new student [numOfStud];
		
		for(int i=0; i<numOfStud; i++){
			
		int var =(int)Math.floor (Math.random()*firstNames.length);//randomly selects name from array
		int cunyID = (int)Math.floor(Math.random()*1000000000);
		GPA = (double)Math.round((Math.random()*4)*10)/10;//generates a random decimal and rounds to the nearest tenth
			
		stud[i] = new student (firstNames[var], lastNames[var], cunyID, GPA, venusLogIn);
		
		
				displayAttributes();
		
		}

		System.out.println("The number of students that exists now is " + studentsNum());
	}

}
