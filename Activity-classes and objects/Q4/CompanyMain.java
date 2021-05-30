import java.util.Scanner;

public class CompanyMain {
	public static void main(String args[]) 
	{ 
		Company obj = new Company();
		
		
		System.out.println("Enter company name");
		
		Scanner f2 = new Scanner(System.in);
	    String name = f2.nextLine();
	    System.out.println("Enter the employees");
	    

	   
	    Scanner f3 = new Scanner(System.in);
	    String employees = f3.nextLine();
	    System.out.println("Enter TeamLead");
	    Scanner f1 = new Scanner(System.in);
	    String Team = f3.nextLine();
	   
		 
	    obj.setName(name);
	    obj.setEmployees(employees);
	    obj.setTeamlead(Team);
		
		
	  String details= name+","+employees+","+Team;
	  System.out.println(details);
	  String [] w=details.split(",");
	  System.out.println("Name:"+w[0]);
	  System.out.println("employees:"+w[1]);
	  System.out.println("TeamLead:"+w[2]);
	}
}