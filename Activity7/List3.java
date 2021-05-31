import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
	
	public static void main(String args[]){

	    ArrayList<String> list1 = new ArrayList<String>();
		System.out.println("Enter first 5 players of season13");
		Scanner f1 = new Scanner(System.in);
        String s1 = f1.nextLine();
        
        
		Scanner f2 = new Scanner(System.in);
        String s2 = f2.nextLine();
        
        
		Scanner f3 = new Scanner(System.in);
        String s3 = f3.nextLine();
		
        
		Scanner f4 = new Scanner(System.in);
        String s4 = f4.nextLine();
		
		Scanner f5 = new Scanner(System.in);
        String  s5 = f5.nextLine();
        
        
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		
		

	    ArrayList<String> list2 = new ArrayList<String>();
		System.out.println("Enter first 5 players of season13");
		Scanner f21 = new Scanner(System.in);
        String s21 = f21.nextLine();
        
        
		Scanner f22 = new Scanner(System.in);
        String s22 = f22.nextLine();
        
        
		Scanner f23 = new Scanner(System.in);
        String s23 = f23.nextLine();
		
        
		Scanner f24 = new Scanner(System.in);
        String s24 = f24.nextLine();
		
		Scanner f25 = new Scanner(System.in);
        String  s25 = f25.nextLine();
        
        
		list2.add(s21);
		list2.add(s22);
		list2.add(s23);
		list2.add(s24);
		list2.add(s25);
		
		
		System.out.println(list2);
		for( String s:list2){
    		System.out.println(s);
    		}

}
}