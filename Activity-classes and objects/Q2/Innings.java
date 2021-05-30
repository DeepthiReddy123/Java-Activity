import java.util.Scanner;

public class Innings {
	private String	teamname;
	private String	inningsname;
	private int	runs;
	
	public String getTeamname() {
		
		return teamname;
	}
	public void setTeamname(String teamname) {
		
		this.teamname = teamname;
	}
	public String getInningsname() {
		
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		
		this.inningsname = inningsname;
	}
	public int getRuns() {
		
		return runs;
	}
	public void setRuns(int runs) {
		
		this.runs = runs;
	}
	
	public static void display(){
		Innings obj = new Innings();
		Innings obj2 = new Innings();
		
		System.out.println("Enter innings name");
		Scanner f2 = new Scanner(System.in);
        String inningsname = f2.nextLine();
        
        System.out.println("Enter runs");
		Scanner f3 = new Scanner(System.in);
        int runs1 = f3.nextInt();
        
        System.out.println("Enter team name");
		Scanner f1 = new Scanner(System.in);
        String teamname1 = f2.nextLine();
		obj.setTeamname(teamname1);
		 obj.setInningsname(inningsname);
		 obj. setRuns(runs1+1);
		 obj2.setRuns(runs1);
		
		System.out.println("teamname : " + obj.getTeamname());
		//System.out.println("inningsname" +obj.getInningsname());
		System.out.println("Scored " + obj2.getRuns());
		System.out.println("need " + obj.getRuns() +" runs to win");
	}

   
}

