import java.util.*;
import java.util.Scanner;
public class List1 {
	public static void main(String args[]){

	    ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter the player details");
		System.out.println("Enter the player name");
		Scanner f1 = new Scanner(System.in);
        String name = f1.nextLine();
        list.add(name);
        System.out.println("Enter age");
		Scanner f2 = new Scanner(System.in);
        String age = f2.nextLine();
        list.add(age);
        System.out.println("Enter country");
		Scanner f3 = new Scanner(System.in);
        String Country = f3.nextLine();
		list.add(Country);
		for( String s:list){
		System.out.println("player name :"+s);
		}
		
		System.out.println("Enter skill ");
		
		Scanner f5 = new Scanner(System.in);
        String  skill = f5.nextLine();
        
        
        
		System.out.println("Enter the position to add skill");
		
		Scanner f4 = new Scanner(System.in);
        int  n = f4.nextInt();
        list.add(n,skill);
        
        for( String s:list){
    		System.out.println("player name :"+s);
    		}
		
        

		System.out.println("Enter the position to be removed");
		
		Scanner f6 = new Scanner(System.in);
        int  m = f6.nextInt();
        list.remove(m);
        
        for( String s:list){
    		System.out.println("player name :"+s);
    		}
	}

}
